package com.yinxf.practice.designpattern.state;

/**
 * @author yinxf
 * @Date 2019/11/5
 * @Description
 **/
public class EveningState extends State {
    @Override
    public void writeProgram(Work w) {
        if (w.isFinish()){
            w.setCurrent(new RestState());
            w.writeProgram();
        }else {
            if (w.getHour() < 21){
                System.out.println("当前时间："+w.getHour()+"点，加班");
            }else {
                w.setCurrent(new SleepingState());
                w.writeProgram();
            }
        }
    }
}
