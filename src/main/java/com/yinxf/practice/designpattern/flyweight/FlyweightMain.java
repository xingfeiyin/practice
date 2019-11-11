package com.yinxf.practice.designpattern.flyweight;

/**
 * @author yinxf
 * @Date 2019/11/7
 * @Description 享元模式
 *
 * 享元模式：运用共享技术有效地支持大量细粒度的对象。
 *
 **/
public class FlyweightMain {

    public static void main(String[] args) {
        int state = 22;

        FlyweightFactory factory = new FlyweightFactory();

        Flyweight fx = factory.getFlyweight("X");
        fx.operation(--state);

        Flyweight fy = factory.getFlyweight("Y");
        fy.operation(--state);

        Flyweight fz = factory.getFlyweight("Z");
        fz.operation(--state);

        UnshareConcreteFlyweight uf = new UnshareConcreteFlyweight();
        uf.operation(--state);

        System.out.println("执行结束。。。");
    }
}
