package com.yinxf.practice.jvm;

/**
 * @author yinxf
 * @Date 2019/11/14
 * @Description
 **/
public class Foo {
    public static void main(String[] args) {
        boolean flag = true;

        if (flag){
            System.out.println("Hello,java!");
        }

        if (flag == true){
            System.out.println("hello,jvm!");
        }
    }
}
