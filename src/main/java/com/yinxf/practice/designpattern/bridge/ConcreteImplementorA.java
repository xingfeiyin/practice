package com.yinxf.practice.designpattern.bridge;

/**
 * @author yinxf
 * @Date 2019/11/7
 * @Description
 **/
public class ConcreteImplementorA extends Implementor {
    @Override
    public void operation() {
        System.out.println("具体实现A的方法执行");
    }
}
