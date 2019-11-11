package com.yinxf.practice.designpattern.prototype;

/**
 * @author yinxf
 * @Date 2019/10/31
 * @Description
 **/
public abstract class Prototype {

    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public abstract Prototype clone();
}
