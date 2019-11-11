package com.yinxf.demo.test.thread;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author yinxf
 * @Date 2019/1/21
 * @Description
 **/
public class ThreadTest {
    /**
     * 两个线程，当一个线程发生OOM时，另一个线程不受影响，可以继续执行。
     * @param aa
     */
    public static void main(String[] aa){

        new Thread(()->{
            List<byte[]> list = new ArrayList<>();
            while (true){
                System.out.println(new Date().toString()+Thread.currentThread()+"==");
                byte[] b = new byte[1024*1024*1];
                list.add(b);
                try {
                    Thread.sleep(1000);
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        }).start();

        new Thread(() -> {
            while(true){
                System.out.println(new Date().toString()+Thread.currentThread()+"==");
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }
}
