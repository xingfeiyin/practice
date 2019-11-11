package com.yinxf.practice.designpattern.builder;

/**
 * @author yinxf
 * @Date 2019/11/1
 * @Description
 **/
public abstract class Builder {

    public abstract void buildPartA();

    public abstract void buildPartB();

    public abstract Product getResult();
}
