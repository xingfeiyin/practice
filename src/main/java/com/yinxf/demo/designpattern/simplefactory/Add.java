package com.yinxf.demo.designpattern.simplefactory;

/**
 * @author yinxf
 * @Date 2019/10/28
 * @Description
 **/
public class Add extends SimpleFactory2 {

    @Override
    public int result() {
        return this.getNumberA() + this.getNumberB();
    }
}
