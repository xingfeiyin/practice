package com.yinxf.demo.designpattern.bridge;

/**
 * @author yinxf
 * @Date 2019/11/7
 * @Description
 **/
public class HandsetMain {

    public static void main(String[] args) {
        HandsetBrand ab = new HandsetBrandN();

        ab.setSoft(new HandsetGame());
        ab.run();

        ab.setSoft(new HandsetAddressList());
        ab.run();

        ab = new HandsetBrandM();
        ab.setSoft(new HandsetGame());
        ab.run();

        ab.setSoft(new HandsetAddressList());
        ab.run();
    }
}
