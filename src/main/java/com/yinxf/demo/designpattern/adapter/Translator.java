package com.yinxf.demo.designpattern.adapter;

/**
 * @author yinxf
 * @Date 2019/11/5
 * @Description
 **/
public class Translator extends Player {

    private ForeignCenter zf = new ForeignCenter();

    public Translator(String name) {
        super(name);
        zf.setName(name);
    }

    @Override
    public void attack() {
        zf.jingong();
    }

    @Override
    public void defense() {
        zf.fangshou();
    }
}
