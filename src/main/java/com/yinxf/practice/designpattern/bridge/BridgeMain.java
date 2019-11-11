package com.yinxf.practice.designpattern.bridge;

/**
 * @author yinxf
 * @Date 2019/11/6
 * @Description 桥接模式
 *
 * 合成/聚合复用原则：尽量使用合成/聚合，尽量不要使用继承。
 * 聚合表示一种弱的拥有关系，提现的是A对象可以包含B对象，但B对象不是A对象的一部分；
 * 合成则是一种强的拥有关系，提现了严格的部分和整体的关系，部分和整体的生命周期一样。
 * 聚合/合成的好处：优先使用对象的合成/聚合将有助于你保持每个类被封装，并被集中在单个任务上，
 *      这样类和类继承层次会保持较小的规模，并且不太可能增长为不可控制的庞然大物。
 *
 * 桥接模式：将抽象部分与它的实现部分分离，使它们都可以独立的变化。
 * 什么叫抽象与它的实现分离，这并不是说让抽象类与其派生类分离，因为这没有任何意义，实现指的是抽象类和
 *      它的派生类用来实现自己的对象。
 **/
public class BridgeMain {

    public static void main(String[] args) {
        Abstraction ab = new RefinedAbstraction();

        ab.setImplementor(new ConcreteImplementorA());
        ab.operation();

        ab.setImplementor(new ConcreteImplementorB());
        ab.operation();
    }
}
