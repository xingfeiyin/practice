package com.yinxf.practice.designpattern.state;

/**
 * @author yinxf
 * @Date 2019/11/5
 * @Description
 **/
public class RestState extends State {
    @Override
    public void writeProgram(Work w) {
        System.out.println("当前时间："+w.getHour()+"点，下班回家了");
    }
}
