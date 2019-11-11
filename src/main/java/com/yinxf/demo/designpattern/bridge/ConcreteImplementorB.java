package com.yinxf.demo.designpattern.bridge;

/**
 * @author yinxf
 * @Date 2019/11/7
 * @Description
 **/
public class ConcreteImplementorB extends Implementor {
    @Override
    public void operation() {
        System.out.println("具体实现B的方法执行");
    }
}
