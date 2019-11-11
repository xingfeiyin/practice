package com.yinxf.practice.designpattern.adapter;

/**
 * @author yinxf
 * @Date 2019/11/5
 * @Description
 **/
public class Forwards extends Player {

    public Forwards(String name) {
        super(name);
    }

    @Override
    public void attack() {
        System.out.println("前锋进攻"+name);
    }

    @Override
    public void defense() {
        System.out.println("前锋防守"+name);
    }
}
