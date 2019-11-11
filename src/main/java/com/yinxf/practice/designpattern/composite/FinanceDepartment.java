package com.yinxf.practice.designpattern.composite;

/**
 * @author yinxf
 * @Date 2019/11/6
 * @Description
 **/
public class FinanceDepartment extends Company {

    public FinanceDepartment(String name) {
        super(name);
    }

    @Override
    public void add(Company c) {

    }

    @Override
    public void remove(Company c) {

    }

    @Override
    public void display(int depth) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < depth; i++) {
            sb.append("-");
        }
        System.out.println(sb.toString() + this.name);
    }

    @Override
    public void lineOfDuty() {
        System.out.println(name+"公司财务收支管理");
    }
}
