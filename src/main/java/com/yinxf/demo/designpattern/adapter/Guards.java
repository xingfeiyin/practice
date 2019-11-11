package com.yinxf.demo.designpattern.adapter;

/**
 * @author yinxf
 * @Date 2019/11/5
 * @Description
 **/
public class Guards extends Player{

    public Guards(String name) {
        super(name);
    }


    @Override
    public void attack() {
        System.out.println("后卫进攻"+name);
    }

    @Override
    public void defense() {
        System.out.println("后卫防守"+name);
    }
}
