package com.yinxf.practice.designpattern.mediator;

/**
 * @author yinxf
 * @Date 2019/11/7
 * @Description
 **/
public abstract class Mediator {

    public abstract void send(String message,Colleague colleague);
}
