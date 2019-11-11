package com.yinxf.demo.designpattern.bridge;

/**
 * @author yinxf
 * @Date 2019/11/7
 * @Description
 **/
public class Abstraction {

    protected Implementor implementor;

    public void setImplementor(Implementor implementor) {
        this.implementor = implementor;
    }

    public void operation(){
        implementor.operation();
    }
}
