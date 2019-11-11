package com.yinxf.demo.designpattern.templatemethod;

/**
 * @author yinxf
 * @Date 2019/10/31
 * @Description
 **/
public class ConcreteClassB extends AbstractClass {
    @Override
    public void primitiveOperation1() {
        System.out.println("具体类B方法1实现");
    }

    @Override
    public void primitiveOperation2() {
        System.out.println("具体类B方法2实现");
    }
}
