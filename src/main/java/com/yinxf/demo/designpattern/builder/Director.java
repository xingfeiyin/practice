package com.yinxf.demo.designpattern.builder;

/**
 * @author yinxf
 * @Date 2019/11/1
 * @Description
 **/
public class Director {

    public void construct(Builder builder){
        builder.buildPartA();
        builder.buildPartB();
    }
}
