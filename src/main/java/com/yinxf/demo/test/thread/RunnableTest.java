package com.yinxf.demo.test.thread;

/**
 * @author yinxf
 * @Date 2019/8/9
 * @Description
 **/
public class RunnableTest {

    public static void main(String[] args) {
        Runnable sample = ()->{
            try {
                System.out.println(Thread.currentThread().getName()+" ==== ");
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } ;
        Thread thread = new Thread(sample);
        thread.start();
        thread.start();
    }
}
