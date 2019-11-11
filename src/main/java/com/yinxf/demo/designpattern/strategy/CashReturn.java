package com.yinxf.demo.designpattern.strategy;

/**
 * @author yinxf
 * @Date 2019/10/28
 * @Description 返利收费子类
 **/
public class CashReturn extends CashSuper {

    private double moneyCondition = 0.0d;
    private double monryReturn = 0.0d;

    public CashReturn(double moneyCondition, double monryReturn) {
        this.moneyCondition = moneyCondition;
        this.monryReturn = monryReturn;
    }


    @Override
    public double acceptCash(double money) {

        if (money > moneyCondition){
            return money - Math.floor(money / moneyCondition) * monryReturn;
        }

        return money;
    }
}
