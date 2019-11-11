package com.yinxf.practice.designpattern.flyweight;

import java.util.HashMap;

/**
 * @author yinxf
 * @Date 2019/11/11
 * @Description
 **/
public class FlyweightFactory {

    private HashMap<String,Flyweight> flyweights = new HashMap<>();

    public FlyweightFactory() {
        flyweights.put("X",new ConcreteFlyweight());
        flyweights.put("Y",new ConcreteFlyweight());
        flyweights.put("Z",new ConcreteFlyweight());
    }

    public Flyweight getFlyweight(String key){
        return flyweights.get(key);
    }
}
