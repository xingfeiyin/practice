package com.yinxf.practice.designpattern.builder;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yinxf
 * @Date 2019/11/1
 * @Description
 **/
public class Product {
    List<String> parts = new ArrayList<>();

    public void add(String part){
        parts.add(part);
    }

    public void show(){
        for (String part : parts) {
            System.out.println(part);
        }
    }

}
