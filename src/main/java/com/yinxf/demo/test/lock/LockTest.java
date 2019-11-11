package com.yinxf.demo.test.lock;


/**
 * @author yinxf
 * @Date 2019/3/29
 * @Description
 **/
public class LockTest {

    private static Object object = new Object();

    public static void main(String[] args) {
//        synchronized (object){
//            System.out.println("已经锁定！！");
//        }

        lock();
    }


    private static synchronized void lock(){
        System.out.println("同步方法！！");
    }

}
