package com.yinxf.practice.designpattern.mediator;

/**
 * @author yinxf
 * @Date 2019/11/7
 * @Description
 **/
public abstract class Colleague {

    protected Mediator mediator;

    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }

}
