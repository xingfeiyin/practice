package com.yinxf.demo.designpattern.strategy;

/**
 * @author yinxf
 * @Date 2019/10/28
 * @Description 打折收费子类
 **/
public class CashRebate extends CashSuper {

    private double moneyRebate = 1d;

    public CashRebate(double moneyRebate) {
        this.moneyRebate = moneyRebate;
    }

    @Override
    public double acceptCash(double money) {
        return money * moneyRebate;
    }
}
