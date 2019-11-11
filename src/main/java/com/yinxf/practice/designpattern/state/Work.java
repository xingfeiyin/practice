package com.yinxf.practice.designpattern.state;

/**
 * @author yinxf
 * @Date 2019/11/5
 * @Description
 **/
public class Work {
    private State current;

    private double hour;
    private boolean finish = false;

    public Work() {
        this.current = new ForenoonState();
    }

    public double getHour() {
        return hour;
    }

    public void setHour(double hour) {
        this.hour = hour;
    }

    public boolean isFinish() {
        return finish;
    }

    public void setFinish(boolean finish) {
        this.finish = finish;
    }

    public void setCurrent(State current) {
        this.current = current;
    }

    public void writeProgram(){
        current.writeProgram(this);
    }
}
