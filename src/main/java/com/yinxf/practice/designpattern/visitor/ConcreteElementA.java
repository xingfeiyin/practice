package com.yinxf.practice.designpattern.visitor;

/**
 * @author yinxf
 * @Date 2019/11/11
 * @Description
 **/
public class ConcreteElementA extends Element {
    @Override
    public void accept(Visitor visitor) {
        visitor.visitConcreteElementA(this);
    }

    public void operationA(){

    }
}
