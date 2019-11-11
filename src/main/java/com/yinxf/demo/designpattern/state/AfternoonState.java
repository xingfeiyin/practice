package com.yinxf.demo.designpattern.state;

/**
 * @author yinxf
 * @Date 2019/11/5
 * @Description
 **/
public class AfternoonState extends State {
    @Override
    public void writeProgram(Work w) {
        if (w.getHour()<17){
            System.out.println("当前时间："+w.getHour()+"点，下午状态还不错");
        }else {
            w.setCurrent(new EveningState());
            w.writeProgram();
        }
    }
}
