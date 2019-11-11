package com.yinxf.demo.designpattern.builder;

/**
 * @author yinxf
 * @Date 2019/11/1
 * @Description
 **/
public class ConcreteBuilder2 extends Builder {

    private Product product = new Product();

    @Override
    public void buildPartA() {
        product.add("部件X");
    }

    @Override
    public void buildPartB() {
        product.add("部件Y");
    }

    @Override
    public Product getResult() {
        return product;
    }
}
