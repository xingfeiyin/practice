package com.yinxf.practice.designpattern.state;

/**
 * @author yinxf
 * @Date 2019/11/5
 * @Description
 **/
public class NoonState extends State {
    @Override
    public void writeProgram(Work w) {
        if (w.getHour()<13){
            System.out.println("当前时间："+w.getHour()+"点，饿了，困了");
        }else {
            w.setCurrent(new AfternoonState());
            w.writeProgram();
        }
    }
}
