package com.yinxf.practice.designpattern.simplefactory;



/**
 * @author yinxf
 * @Date 2019/10/28
 * @Description
 **/
public class SimpleFactory1 {

    public static void main(String[] args) {
        System.out.println(result(1, 2, "+"));
    }

    private static int result(int numberA,int numberB,String sign) {
        int result = 0;
        if ("+".equals(sign)){
            result = numberA+numberB;
        }

        if ("-".equals(sign)){
            result = numberA-numberB;
        }

        if ("*".equals(sign)){
            result = numberA*numberB;
        }

        if ("/".equals(sign)){
            result = numberA/numberB;
        }

        return result;
    }
}
