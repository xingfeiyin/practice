package com.yinxf.practice.designpattern.flyweight;

/**
 * @author yinxf
 * @Date 2019/11/11
 * @Description
 **/
public class UnshareConcreteFlyweight extends Flyweight {
    @Override
    public void operation(int state) {
        System.out.println("不共享的具体Flyweight："+state);
    }
}
