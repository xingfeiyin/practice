package com.yinxf.demo.test.thread;

/**
 * @author yinxf
 * @Date 2019/9/25
 * @Description
 **/
public class ThreadPoolTest implements Runnable {
    @Override
    public void run() {
        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
