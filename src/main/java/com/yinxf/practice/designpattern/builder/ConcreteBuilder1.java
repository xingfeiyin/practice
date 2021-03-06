package com.yinxf.practice.designpattern.builder;

/**
 * @author yinxf
 * @Date 2019/11/1
 * @Description
 **/
public class ConcreteBuilder1 extends Builder {
    private Product product = new Product();

    @Override
    public void buildPartA() {
        product.add("部件A");
    }

    @Override
    public void buildPartB() {
        product.add("部件B");
    }

    @Override
    public Product getResult() {
        return product;
    }
}
