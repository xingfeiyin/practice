package com.yinxf.practice.test.thread;


/**
 * @author yinxf
 * @Date 2019/8/9
 * @Description
 **/
public class volatileSample {

    private static volatile boolean initFlag = false;

    public static void main(String[] args) throws InterruptedException {

        new Thread(() -> {
            System.out.println("run start.....");
            while (!initFlag){

            }
            System.out.println("run  end!");
        }).start();

        Thread.sleep(2000);
        new Thread(() -> {
            System.out.println("prepare start...");
            initFlag =true;
            System.out.println("prepare end...");
        }).start();
    }
}
