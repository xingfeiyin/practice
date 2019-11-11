package com.yinxf.demo.test.thread;

/**
 * @author yinxf
 * @Date 2019/8/12
 * @Description
 **/
public class DeadLockThread extends Thread{

    private String first ;
    private String second ;

    public DeadLockThread(String name,String first,String second){
        super(name);
        this.first = first;
        this.second = second;
    }

    @Override
    public void run() {
        synchronized (first){
            System.out.println(this.getName() +" obtained:"+first);
            try {
                Thread.sleep(1000L);
                synchronized (second){
                    System.out.println(this.getName() + " obtained:"+second);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
