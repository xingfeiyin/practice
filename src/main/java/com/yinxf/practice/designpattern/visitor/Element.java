package com.yinxf.practice.designpattern.visitor;

/**
 * @author yinxf
 * @Date 2019/11/11
 * @Description
 **/
public abstract class Element {
    public abstract void accept(Visitor visitor);
}
