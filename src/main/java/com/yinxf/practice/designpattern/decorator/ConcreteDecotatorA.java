package com.yinxf.practice.designpattern.decorator;

/**
 * @author yinxf
 * @Date 2019/10/30
 * @Description
 **/
public class ConcreteDecotatorA extends Decorator {
    private String addedState;

    @Override
    public void operation() {
        super.operation();
        addedState = "new state";
        System.out.println("具体装饰对象A的操作");
    }
}
