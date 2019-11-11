package com.yinxf.demo.designpattern.decorator;

/**
 * @author yinxf
 * @Date 2019/10/30
 * @Description
 **/
public class ConcreteDecoratorB extends Decorator {

    @Override
    public void operation() {
        super.operation();
        addedBehavior();
        System.out.println("具体装饰对象B的操作");
    }

    private void addedBehavior() {

    }
}
