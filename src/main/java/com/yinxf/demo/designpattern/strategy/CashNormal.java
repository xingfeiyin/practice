package com.yinxf.demo.designpattern.strategy;

/**
 * @author yinxf
 * @Date 2019/10/28
 * @Description 正常收费子类
 **/
public class CashNormal extends CashSuper {
    @Override
    public double acceptCash(double money) {
        return money;
    }
}
