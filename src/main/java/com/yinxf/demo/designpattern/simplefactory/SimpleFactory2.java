package com.yinxf.demo.designpattern.simplefactory;

/**
 * @author yinxf
 * @Date 2019/10/28
 * @Description
 **/
public abstract class SimpleFactory2 {
    private int numberA;
    private int numberB;

    public int getNumberA() {
        return numberA;
    }

    public void setNumberA(int numberA) {
        this.numberA = numberA;
    }

    public int getNumberB() {
        return numberB;
    }

    public void setNumberB(int numberB) {
        this.numberB = numberB;
    }

    public abstract int result();
}
