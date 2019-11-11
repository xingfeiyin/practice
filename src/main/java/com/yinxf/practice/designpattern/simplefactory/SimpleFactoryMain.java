package com.yinxf.practice.designpattern.simplefactory;

/**
 * @author yinxf
 * @Date 2019/10/28
 * @Description 简单工厂模式
 **/
public class SimpleFactoryMain {

    public static void main(String[] args) {
        SimpleFactory2 factory = operation("-");
        factory.setNumberA(2);
        factory.setNumberB(5);
        System.out.println(factory.result());
    }

    public static SimpleFactory2 operation(String oper){
        SimpleFactory2 factory = null;
        switch (oper){
            case "+":
                factory = new Add();
                break;
            case "-":
                factory = new Sub();
                break;
            case "*":
                factory = new Mul();
                break;
            case "/":
                factory = new Div();
                break;
        }
        return factory;
    }
}
