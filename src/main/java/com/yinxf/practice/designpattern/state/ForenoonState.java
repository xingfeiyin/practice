package com.yinxf.practice.designpattern.state;

/**
 * @author yinxf
 * @Date 2019/11/5
 * @Description
 **/
public class ForenoonState extends State {

    @Override
    public void writeProgram(Work w) {
        if (w.getHour() < 12){
            System.out.println("当前时间："+w.getHour() +"点，上午工作");
        }else {
            w.setCurrent(new NoonState());
            w.writeProgram();
        }
    }
}
