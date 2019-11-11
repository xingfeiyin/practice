package com.yinxf.practice.designpattern.command;

/**
 * @author yinxf
 * @Date 2019/11/7
 * @Description
 **/
public class Invoker {

    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void executeCommand(){
        command.execute();
    }
}
