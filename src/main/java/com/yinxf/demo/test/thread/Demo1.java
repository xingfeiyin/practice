package com.yinxf.demo.test.thread;

import java.util.Random;
import java.util.concurrent.*;

/**
 * @author yinxf
 * @Date 2019/9/24
 * @Description  Java 如何实现线程间通信
 **/
public class Demo1 {


    public static void main(String[] args) {
//        demo1();
//        demo2();
//        demo3();
//        demo4();
//        demo5();
        demo6();
    }

    /**
     * 如何让两个线程依次执行
     */
    private static void demo1(){
        Thread A = new Thread(()->{
            printNumber("A");
        });

        Thread B = new Thread(()->{
            printNumber("B");
        });

        A.start();
        B.start();
    }

    /**
     *如果我们希望 B 在 A 全部打印 完后再开始打印呢？我们可以利用 thread.join() 方法，代码如下:
     */
    private static void demo2(){
        Thread A = new Thread(()->{
            printNumber("A");
        });

        Thread B = new Thread(()->{
            System.out.println("B开始等待A");
            try {
                A.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            printNumber("B");
        });

        A.start();
        B.start();
    }

    /**
     * 那如何让 两个线程按照指定方式有序交叉运行呢？
     */
    private static void demo3(){
        Object o = new Object();
        Thread a = new Thread(()->{
            synchronized (o){
                System.out.println("a1");
                try {
                    o.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("a2");
                System.out.println("a3");
            }
        });

        Thread b = new Thread(()->{
            synchronized (o){
                System.out.println("b1");
                System.out.println("b2");
                System.out.println("b3");
                o.notify();
            }
        });

        a.start();
        b.start();

    }

    /**
     * 四个线程 A B C D，其中 D 要等到 A B C 全执行完毕后才执行，而且 A B C 是同步运行的
     */
    private static void demo4(){
        int worker = 3;
        CountDownLatch latch = new CountDownLatch(worker);
        new Thread(()->{
            System.out.println("D is waiting for other three threads");
            try {
                latch.await();
                System.out.println("all done,D starts working");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();

        for (char threadName = 'A' ; threadName <= 'C' ; threadName++){
            final String t = String.valueOf(threadName);
            new Thread(()->{
                System.out.println(t + " is working");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(t + " finished");
                latch.countDown();
            }).start();
        }
    }


    /**
     * 三个运动员各自准备，等到三个人都准备好后，再一起跑
     */
    private static void demo5(){
        int runner = 3;
        CyclicBarrier barrier = new CyclicBarrier(runner);
        final Random random = new Random();
        for (char name = 'A' ; name <= 'C' ; name++){
            final String n = String.valueOf(name);
            new Thread(()->{
                long time = random.nextInt(10000)+100;
                System.out.println(n +" is preparing for time:" +time);
                try {
                    Thread.sleep(time);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                try {
                    System.out.println(n +" is prepared,waiting for others");
                    barrier.await();//当前运动员准备完毕，等待别人准备好
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } catch (BrokenBarrierException e) {
                    e.printStackTrace();
                }

                System.out.println(n + " starts running"); //所有运动员都准备好了，一起开始跑
            }).start();
        }
    }

    /**
     * 实际的开发中，我们经常要创建子线程来做一些耗时任务，
     * 然后把任务执行结果回传给主线程使用，
     * 这种情况在 Java 里要如何实现呢？
     */
    private static void demo6(){
        Callable<Integer> callable = ()->{
                System.out.println("start");
                Thread.sleep(1000);
                int result = 0;
                for (int i = 0; i <= 100 ; i++) {
                    result = result+i;
                }
                System.out.println("return result");
                return result;
        };

        FutureTask<Integer> futureTask = new FutureTask<>(callable);

        new Thread(futureTask).start();
        try {
            System.out.println("get()之前");
            System.out.println("获取结果："+futureTask.get());
            System.out.println("get()之后");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

    }


    private static void printNumber(String name) {
        int i = 0;
        while (i++<3){
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(name + " print :" + i);
        }

    }


}
