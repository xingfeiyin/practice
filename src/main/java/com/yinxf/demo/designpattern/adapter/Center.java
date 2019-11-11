package com.yinxf.demo.designpattern.adapter;

/**
 * @author yinxf
 * @Date 2019/11/5
 * @Description
 **/
public class Center extends Player{

    public Center(String name) {
        super(name);
    }

    @Override
    public void attack() {
        System.out.println("中锋进攻"+name);
    }

    @Override
    public void defense() {
        System.out.println("中锋防守"+name);
    }
}
