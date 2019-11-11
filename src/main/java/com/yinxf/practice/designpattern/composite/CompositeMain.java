package com.yinxf.practice.designpattern.composite;

/**
 * @author yinxf
 * @Date 2019/11/6
 * @Description 组合模式
 *
 * 组合模式：将对象组合成树形结构以表示“部分-整体”的层次结构，组合模式使得用户对单个对象和组合对象的使用具有一致性
 *
 * 组合模式好处：
 * 1.组合模式定义了包含了基本对象的组合对象的类层次结构，基本对象可以被组合成更复杂的组合对象，而这个组合对象又可以被组合，
 *      这样不断的递归下去，客户代码中，任何用到基本对象的地方都可以使用组合对象了。
 * 2.用户不用关心到底是处理一个叶节点还是处理一个组合组件，也就用不着为定义组合而写一些选择判断语句了。
 * 3.组合模式让客户可以一致地使用组合结构和单个对象。
 **/
public class CompositeMain {

    public static void main(String[] args) {
        ConcreteCompany root = new ConcreteCompany("北京总公司");
        root.add(new HRDepartment("总公司人力资源部"));
        root.add(new FinanceDepartment("总公司财务部"));

        ConcreteCompany comp = new ConcreteCompany("上海华东分公司");
        comp.add(new HRDepartment("上海华东分公司人力资源部"));
        comp.add(new FinanceDepartment("上海华东分公司财务部"));

        ConcreteCompany compC = new ConcreteCompany("上海华东分公司浦东区办事处");
        compC.add(new HRDepartment("上海华东分公司浦东区办事处人力资源部"));
        compC.add(new FinanceDepartment("上海华东分浦东区办事处公司财务部"));
        comp.add(compC);
        root.add(comp);


        ConcreteCompany comp1 = new ConcreteCompany("南京办事处");
        comp1.add(new HRDepartment("南京办事处人力资源部"));
        comp1.add(new FinanceDepartment("南京办事处财务部"));
        root.add(comp1);

        ConcreteCompany comp2 = new ConcreteCompany("杭州办事处");
        comp2.add(new HRDepartment("杭州办事处人力资源部"));
        comp2.add(new FinanceDepartment("杭州办事处财务部"));
        root.add(comp2);

        System.out.println("结构图");
        root.display(1);

        System.out.println("职责：");
        root.lineOfDuty();
    }
}
