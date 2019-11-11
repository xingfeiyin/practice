package com.yinxf.demo.test.arithmetic;


/**
 * @author yinxf
 * @Date 2019/1/25
 * @Description
 **/
public class DataTest {

    public static void main(String[] args) {
        one();

    }

    public static void one(){
        //判断一个整数是不是2的整数次幂
        // n&(n-1) == 0
        int flag = 4 & (4-1) ;
        System.out.println(flag == 0);
    }

    private void two(){
        //判断一个整数是不是2的整数次幂
        // n&(n-1) == 0
        int flag = 4 & (4-1) ;
        System.out.println(flag == 0);
    }
}
