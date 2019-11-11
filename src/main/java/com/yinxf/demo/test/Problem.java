package com.yinxf.demo.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author yinxf
 * @Date 2019/8/1
 * @Description
 **/
public class Problem {
    public static void main(String[] args) {
//        test1();
//        test2();
        test3();
    }

    private static void test3() {
        final List<String> strList = new ArrayList<>();
        strList.add("hello");
        strList.add("world");
    }

    private static void test2() {
        try {
            System.exit(1);
        }finally {
            System.out.println("finally context");
        }
    }

    private static void test1(){
        byte a = 1;
        short b = 1;
        Object c = a+b;
        System.out.println(c.getClass());
    }
}
