package com.yinxf.demo.designpattern.templatemethod;

/**
 * @author yinxf
 * @Date 2019/10/31
 * @Description 模板方法模式
 *
 * 模板方法模式是通过把不变行为搬移到超类，去除子类中的重复代码来提现它的优势
 * 模板方法模式就是提供了一个很好的代码复用平台
 * 当不变的和可变的行为在方法的子类实现中混合在一起的时候，不变的行为就会在子类中重复出现，
 *      通过模板方法模式把这些行为搬移到单一的地方，这样就帮助子类摆脱重复的不变行为的纠缠。
 *
 *
 **/
public class TemplateMethodMain {

    public static void main(String[] args) {
        AbstractClass c = new ConcreteClassA();
        c.templateMethod();

        c = new ConcreteClassB();
        c.templateMethod();
    }
}
