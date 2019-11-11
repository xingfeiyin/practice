package com.yinxf.demo.designpattern.adapter;

/**
 * @author yinxf
 * @Date 2019/11/5
 * @Description
 **/
public class ForeignCenter {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void jingong(){
        System.out.println("外籍中锋进攻"+name);
    }
    public void fangshou(){
        System.out.println("外籍中锋防守"+name);
    }
}
