package com.yinxf.practice.designpattern.interpreter;

/**
 * @author yinxf
 * @Date 2019/11/11
 * @Description
 **/
public class TerminalExpression extends AbstractExpression {
    @Override
    public void interpret(Context context) {
        System.out.println("终端解释器");
    }
}
