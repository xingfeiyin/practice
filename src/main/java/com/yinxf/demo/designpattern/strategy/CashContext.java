package com.yinxf.demo.designpattern.strategy;

/**
 * @author yinxf
 * @Date 2019/10/28
 * @Description
 **/
public class CashContext {

    private CashSuper cashSuper;

    public CashContext(String type) {
        switch (type){
            case "正常收费":
                cashSuper = new CashNormal();
                break;
            case "满300返100":
                cashSuper = new CashReturn(300,100);
                break;
            case "打8折":
                cashSuper =new CashRebate(0.8);
                break;
        }
    }

    public double acceptCash(double money){
        return cashSuper.acceptCash(money);
    }
}
