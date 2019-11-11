package com.yinxf.demo.test.thread;


import java.util.concurrent.CountDownLatch;

/**
 * @author yinxf
 * @Date 2019/9/3
 * @Description CountDownLatch
 **/
public class Player extends Thread {

    private static int count=1;
    private final int id = count++;
    private CountDownLatch latch;

    public Player(CountDownLatch latch){
        this.latch = latch;
    }

    @Override
    public void run() {
        System.out.println("玩家"+id+"入场");
        latch.countDown();
    }

    public static void main(String[] args) throws InterruptedException {
        CountDownLatch latch = new CountDownLatch(3);
        System.out.println("start....");
        new Player(latch).start();
        new Player(latch).start();
        new Player(latch).start();
        latch.await();
        System.out.println("玩家到齐，开始发牌。。。");
    }
}
