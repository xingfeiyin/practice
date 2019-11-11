package com.yinxf.practice.designpattern.mediator;

/**
 * @author yinxf
 * @Date 2019/11/7
 * @Description
 **/
public class ConcreteMediator extends Mediator {

    private ConcreteColleague1 colleague1;
    private ConcreteColleague2 colleague2;

    public void setColleague1(ConcreteColleague1 colleague1) {
        this.colleague1 = colleague1;
    }

    public void setColleague2(ConcreteColleague2 colleague2) {
        this.colleague2 = colleague2;
    }

    @Override
    public void send(String message, Colleague colleague) {
        if (colleague == colleague1){
            colleague2.notify1(message);
        }else {
            colleague1.notify1(message);
        }
    }
}
