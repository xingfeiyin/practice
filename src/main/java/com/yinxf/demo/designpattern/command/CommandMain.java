package com.yinxf.demo.designpattern.command;

/**
 * @author yinxf
 * @Date 2019/11/7
 * @Description 命令模式
 *
 * 命令模式：将一个请求封装为一个对象，从而使你可用不同的请求对客户进行参数化，对请求排队或记录请求日志，以及支持可撤销的操作。
 *
 * 作用：
 * 1.能较容易的设计一个命令队列，
 * 2.在需要的情况下，可以较容易的将命令记入日志
 * 3.允许接收请求的一方决定是否拒绝请求
 * 4.可以容易的实现对请求的撤销和重做
 * 5.由于加进新的具体命令类不影响其他的类，因此增加新的具体命令类很容易。
 * 6.命令模式把请求一个操作的对象与知道怎么执行一个操作的对象分隔开
 *
 **/
public class CommandMain {

    public static void main(String[] args) {
        Receiver r = new Receiver();
        Command c = new ConcreteCommand(r);
        Invoker i = new Invoker();

        i.setCommand(c);
        i.executeCommand();
    }

}
