package com.yinxf.practice.designpattern.templatemethod;

/**
 * @author yinxf
 * @Date 2019/10/31
 * @Description
 **/
public abstract class AbstractClass {

    //一些抽象行为，放到子类去实现
    public abstract void primitiveOperation1();

    public abstract void primitiveOperation2();

    public void templateMethod(){
        primitiveOperation1();
        primitiveOperation2();
        System.out.println("模板方法，给出了逻辑的骨架，而逻辑的组成是一些相应的抽象操作，他们都推迟到子类实现");
    }
}
