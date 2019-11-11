package com.yinxf.practice.designpattern.single;

/**
 * @author yinxf
 * @Date 2019/11/6
 * @Description
 **/
public class SingleDemo {

    private static SingleDemo demo = null;

    private SingleDemo() {
    }

    public static SingleDemo getInstance(){

        if (demo == null){
            synchronized (SingleDemo.class){
                if (demo == null){
                    demo = new SingleDemo();
                }
            }
        }

        return demo;
    }
}
