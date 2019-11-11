package com.yinxf.demo.designpattern.abstractfactory;

/**
 * @author yinxf
 * @Date 2019/11/4
 * @Description 抽象工厂模式
 *
 * 抽象工厂模式：提供一个创建一系列相关或相互依赖对象的接口，而无需指定它们具体的类
 *
 * 抽象工厂模式的优缺点：
 * 1.好处是易于交换产品系列，由于具体工厂类，在一个应用中只需要在初始化的时候出现一次，
 *      这就使得改变一个应用的具体工厂变得非常容易，它只需要改变具体工厂即可使用不同的产品配置。
 * 2.它让具体的创建实例过程与客户端分离，客户端是通过它们的抽象接口操纵实例，
 *      产品的具体类名也被具体工厂的实现分离，不会出现在客户端代码中
 **/
public class AbstractFactoryMain {

    public static void main(String[] args) {

    }
}