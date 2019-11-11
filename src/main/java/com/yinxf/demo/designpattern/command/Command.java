package com.yinxf.demo.designpattern.command;

/**
 * @author yinxf
 * @Date 2019/11/7
 * @Description
 **/
public abstract class Command {

    protected Receiver receiver;

    public Command(Receiver receiver) {
        this.receiver = receiver;
    }

    public abstract void execute();
}
