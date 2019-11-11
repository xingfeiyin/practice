package com.yinxf.demo.test.thread;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author yinxf
 * @Date 2019/9/25
 * @Description 线程池相关的
 **/
public class ThreadPoolMain {

    public static void main(String[] args) {
        LinkedBlockingQueue<Runnable> queue = new LinkedBlockingQueue<>(5);
        ThreadPoolExecutor threadPool = new ThreadPoolExecutor(5,10,60,TimeUnit.SECONDS,queue);

        for (int i = 0; i < 16; i++) {
            threadPool.execute(new Thread(new ThreadPoolTest(),"Thread".concat(i+"")));
            System.out.println("线程池中活跃的线程数："+threadPool.getPoolSize());

            if (queue.size()>0){
                System.out.println("------------------队列中阻塞的线程数，"+queue.size());
            }

        }

        threadPool.shutdown();

    }
}
