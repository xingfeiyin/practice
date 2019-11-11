package com.yinxf.practice.designpattern.templatemethod;

/**
 * @author yinxf
 * @Date 2019/10/31
 * @Description
 **/
public class ConcreteClassA extends AbstractClass {
    @Override
    public void primitiveOperation1() {
        System.out.println("具体类A方法1实现");
    }

    @Override
    public void primitiveOperation2() {
        System.out.println("具体类A方法2实现");
    }
}
