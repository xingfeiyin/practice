package com.yinxf.practice.designpattern.bridge;

/**
 * @author yinxf
 * @Date 2019/11/7
 * @Description
 **/
public class RefinedAbstraction extends Abstraction {

    @Override
    public void operation() {
        implementor.operation();
    }
}
