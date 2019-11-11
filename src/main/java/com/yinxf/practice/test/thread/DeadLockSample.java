package com.yinxf.practice.test.thread;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author yinxf
 * @Date 2019/8/12
 * @Description
 **/
@Controller
public class DeadLockSample extends Thread {


    @GetMapping("/thread/deadLock")
    public  String sample() throws InterruptedException {
        String lockA = "lockA";
        String lockB = "lockB";
        DeadLockThread t1 = new DeadLockThread("thread1",lockA,lockB);
        DeadLockThread t2 = new DeadLockThread("thread2",lockB,lockA);
        t1.start();
        t2.start();
        t1.join();
        t2.join();

        return "seccess!";
    }
}
