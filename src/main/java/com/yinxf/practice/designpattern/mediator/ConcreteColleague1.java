package com.yinxf.practice.designpattern.mediator;

/**
 * @author yinxf
 * @Date 2019/11/7
 * @Description
 **/
public class ConcreteColleague1 extends Colleague {
    public ConcreteColleague1(Mediator mediator) {
        super(mediator);
    }

    public void send(String message){
        mediator.send(message,this);
    }

    public void notify1(String message){
        System.out.println("同事1得到信息"+message);
    }
}
