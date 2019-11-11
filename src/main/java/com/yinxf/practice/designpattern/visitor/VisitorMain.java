package com.yinxf.practice.designpattern.visitor;

/**
 * @author yinxf
 * @Date 2019/11/11
 * @Description 访问者模式
 *
 * 访问者模式：表示一个作用于某对象结构中的各个元素的操作。它使你可以在不改变各元素的类的前提下定义
 *      作用于这些元素的新操作。
 *
 * 1.访问者模式适用于数据结构相对稳定的系统，它把数据结构和作用于结构上的操作之间的耦合解脱开，
 *      使得操作集合可以相对自由地演化。
 * 2.访问者模式的目的是要把处理从数据结构分离出来，有比较稳定的数据结构，又有易于变化的算法的话，使用访问者模式就是比较合适的，
 *      因为访问者模式使得算法操作的增加变得容易。
 * 3.访问者模式的优点就是增加新的操作很容易，因为增加新的操作就意味着增加一个新的访问者，访问者模式将有关的行为集中到一个
 *      访问者对象中。
 * 4.访问者模式的缺点是使增加新的数据结构变得困难了。
 *
 **/
public class VisitorMain {

    public static void main(String[] args) {
        ObjectStructure o = new ObjectStructure();

        o.attach(new ConcreteElementA());
        o.attach(new ConcreteElementB());

        ConcreteVisitor1 v1 = new ConcreteVisitor1();
        ConcreteVisitor2 v2 = new ConcreteVisitor2();

        o.accept(v1);
        o.accept(v2);

        System.out.println("执行结束。。。");
    }
}
