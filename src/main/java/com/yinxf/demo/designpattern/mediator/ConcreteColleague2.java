package com.yinxf.demo.designpattern.mediator;

/**
 * @author yinxf
 * @Date 2019/11/7
 * @Description
 **/
public class ConcreteColleague2 extends Colleague{
    public ConcreteColleague2(Mediator mediator) {
        super(mediator);
    }

    public void send(String message){
        mediator.send(message,this);
    }

    public void notify1(String message){
        System.out.println("同事2得到信息"+message);
    }
}
