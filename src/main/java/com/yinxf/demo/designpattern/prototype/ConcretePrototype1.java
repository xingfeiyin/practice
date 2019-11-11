package com.yinxf.demo.designpattern.prototype;

/**
 * @author yinxf
 * @Date 2019/10/31
 * @Description
 **/
public class ConcretePrototype1 extends Prototype {

    public ConcretePrototype1(String id){
        this.setId(id);
    }
    @Override
    public Prototype clone() {
        return null;
    }
}
