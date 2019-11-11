package com.yinxf.demo.designpattern.decorator;

/**
 * @author yinxf
 * @Date 2019/10/30
 * @Description 装饰模式
 *
 * 装饰模式是为已有功能动态地添加更多功能的一种方式
 * 当系统需要新功能的时候，是向旧的类中添加新的代码，这些新加的代码通常装饰了原有类的核心职责或主要行为。
 * 在主类中加入了新的字段，新的方法和新的逻辑，从而增加了主类的复杂度，而这些新加入的东西仅仅是为了满足一些只在某种特定情况下才会执行的
 * 特殊行为的需要。装饰模式却提供了一个非常好的解决方案，它把每个要装饰的功能放在单独的类中，并让这个类包装它所要装饰的对象，因此，
 * 当需要执行特殊行为时，客户客户代码就可以再运行时根据需要有选择地、按顺序地使用装饰功能包装对象了。
 *
 * 装饰模式的优点：把类中的装饰功能从类中搬移去除，这样可以简化原有的类。有效地把类的核心职责和装饰功能区分开了，而且可以去除相关类中
 * 重复的装饰逻辑
 *
 *
 **/
public class DecoratorMain {

    public static void main(String[] args) {
//        Person person = new Person("小菜");
//        Finery t = new TShirts();
//        Finery big = new BigTrouser();

        ConcreteCompenent c = new ConcreteCompenent();
        ConcreteDecotatorA a = new ConcreteDecotatorA();
        ConcreteDecoratorB b = new ConcreteDecoratorB();

        a.setComponent(c);
        b.setComponent(a);
        b.operation();

    }
}
