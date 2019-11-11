package com.yinxf.demo.designpattern.builder;

/**
 * @author yinxf
 * @Date 2019/10/31
 * @Description 建造者模式
 *
 * 建造者模式：将一个复杂对象的构建与它的标识分离，使得同样的构建过程可以创建不同的表示。
 *
 **/
public class BuilderMain {

    public static void main(String[] args) {
        Director director = new Director();
        Builder b1 = new ConcreteBuilder1();
        Builder b2 = new ConcreteBuilder2();

        director.construct(b1);
        Product p1 = b1.getResult();
        p1.show();

        director.construct(b2);
        Product p2 = b2.getResult();
        p2.show();
    }
}
