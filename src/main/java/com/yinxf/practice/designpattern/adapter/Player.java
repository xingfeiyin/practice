package com.yinxf.practice.designpattern.adapter;

/**
 * @author yinxf
 * @Date 2019/11/5
 * @Description
 **/
public abstract class Player {
    protected String  name;

    public Player(String name) {
        this.name = name;
    }

    public abstract void attack();
    public abstract void defense();
}
