package com.yinxf.practice.designpattern.visitor;

/**
 * @author yinxf
 * @Date 2019/11/11
 * @Description
 **/
public class ConcreteElementB extends Element {
    @Override
    public void accept(Visitor visitor) {
        visitor.visitConcreteElementB(this);
    }

    public void operationB(){

    }
}
