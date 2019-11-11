package com.yinxf.practice.designpattern.command;

/**
 * @author yinxf
 * @Date 2019/11/7
 * @Description
 **/
public class ConcreteCommand extends Command {

    public ConcreteCommand(Receiver receiver) {
        super(receiver);
    }

    @Override
    public void execute() {
        receiver.action();
    }
}
