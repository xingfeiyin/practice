package com.yinxf.demo.designpattern.facade;

/**
 * @author yinxf
 * @Date 2019/10/31
 * @Description
 **/
public class Facade {

    SubSystemOne subSystemOne;
    SubSystemTwo subSystemTwo;
    SubSystemThree subSystemThree;
    SubSystemFour subSystemFour;

    public Facade() {
        subSystemOne = new SubSystemOne();
        subSystemTwo = new SubSystemTwo();
        subSystemThree = new SubSystemThree();
        subSystemFour = new SubSystemFour();
    }

    public void methodA(){
        System.out.println("方法A");
        subSystemOne.one();
        subSystemTwo.two();
        subSystemFour.four();
    }

    public void methodB(){
        System.out.println("方法B");
        subSystemTwo.two();
        subSystemThree.three();
    }

}
