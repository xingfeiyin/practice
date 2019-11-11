package com.yinxf.demo.test.reflect;

import java.lang.reflect.Method;

/**
 * @author yinxf
 * @Date 2019/3/29
 * @Description
 **/
public class ReflectTest {

    public static void main(String[] args) throws Exception {
        String test = "com.yinxf.demo.test.arithmetic.DataTest";
        //获取class对象
        Class<?> clazz = Class.forName(test);


        //一、反射执行方法

        //获取所有的方法，包括从父类继承的方法，不能获取private方法，
        Method[] methods = clazz.getMethods();
        for (Method method : methods) {
            System.out.println("method===="+method.getName());
        }

        //获取指定的方法，需要参数名称和参数列表，无参可以不写
        Method one = clazz.getMethod("one", null);
        System.out.println(one);

        //执行方法，invoke第一个参数表示执行那个对象的方法，剩下的参数是执行方法时需要传入的参数
        Object o = clazz.newInstance();
        System.out.println(o.toString());
        one.invoke(o,null);


        //二、反射执行私有方法

        //获取所有方法，包括私有方法，只能获取当前类的方法，不包括父类
        Method[] declaredMethods = clazz.getDeclaredMethods();
        for (Method declaredMethod : declaredMethods) {
            System.out.println("private method=="+declaredMethod.getName());
        }

        //获取指定的方法，需要参数名称和参数列表，无参可以不写
        Method two = clazz.getDeclaredMethod("two",null);
        System.out.println("private=="+two);


        //执行方法，invoke第一个参数表示执行那个对象的方法，剩下的参数是执行方法时需要传入的参数
        Object obj = clazz.newInstance();
        two.setAccessible(true);
        two.invoke(obj,null);

    }
}
