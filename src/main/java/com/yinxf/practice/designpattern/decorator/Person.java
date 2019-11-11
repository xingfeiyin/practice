package com.yinxf.practice.designpattern.decorator;

/**
 * @author yinxf
 * @Date 2019/10/30
 * @Description
 **/
public class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public void show(){
        System.out.println("装扮的"+name);
    }
}
