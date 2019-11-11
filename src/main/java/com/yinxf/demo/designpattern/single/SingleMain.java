package com.yinxf.demo.designpattern.single;

/**
 * @author yinxf
 * @Date 2019/11/6
 * @Description 单例模式
 *
 * 单例模式：保证一个类仅有一个实例，并提供一个访问它的全局访问点
 **/
public class SingleMain {

    public static void main(String[] args) {
        SingleDemo demo = SingleDemo.getInstance();
        System.out.println(demo);

        SingleDemo demo1 = SingleDemo.getInstance();
        System.out.println(demo1);
    }
}
