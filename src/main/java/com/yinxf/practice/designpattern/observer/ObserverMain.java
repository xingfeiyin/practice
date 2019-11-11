package com.yinxf.practice.designpattern.observer;

/**
 * @author yinxf
 * @Date 2019/11/1
 * @Description 观察者模式
 *
 * 观察者模式特点：
 * 1.将一个系统分割成一系列相互协作的类有一个很不好的副作用，那就是需要维护相关对象间的一致性，
 *      我们不希望为了一致性而使各类紧密耦合，这样会给维护、扩展和重用都带来不便。
 * 2.当一个对象的改变需要同时改变其他对象的时候，而且它不知道具体有待改变时，应该考虑使用观察者模式。
 * 3.一个抽象模型有两个方面，其中一方面依赖于另一方面，这时用观察者模式可以将这两者封装在独立的对象中
 *      使它们各自独立的改变和复用。
 * 4.观察者模式所做的工作其实就是在解除耦合，让耦合的双方都依赖于对象，而不是依赖于具体。从而使得
 *      各自的变化都不会影响另一边的变化。
 *
 **/
public class ObserverMain {

    public static void main(String[] args) {
        ConcreteSubject s = new ConcreteSubject();
        s.attach(new ConcreteObserver(s,"X"));
        s.attach(new ConcreteObserver(s,"Y"));
        s.attach(new ConcreteObserver(s,"Z"));

        s.setSubjectState("ABC");
        s.notifyObserver();
    }
}
