package com.yinxf.practice.designpattern.simplefactory;

/**
 * @author yinxf
 * @Date 2019/10/28
 * @Description
 **/
public class Sub extends SimpleFactory2 {
    @Override
    public int result() {
        return this.getNumberA()-this.getNumberB();
    }
}
