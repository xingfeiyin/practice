package com.yinxf.practice.designpattern.visitor;

/**
 * @author yinxf
 * @Date 2019/11/11
 * @Description
 **/
public abstract class Visitor {

    public abstract void visitConcreteElementA(ConcreteElementA concreteElementA);

    public abstract void visitConcreteElementB(ConcreteElementB concreteElementB);
}
