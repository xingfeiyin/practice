package com.yinxf.practice.designpattern.adapter;

/**
 * @author yinxf
 * @Date 2019/11/5
 * @Description 适配器模式
 *
 * 适配器模式：将一个类的接口转换成客户系统的另一个类的接口，adapter模式使得原本由于接口不兼容而不能一起工作的那些类可以一起工作。
 *
 **/
public class AdapterMain {

    public static void main(String[] args) {
        Player b = new Forwards("芭提尔");
        b.attack();
        Player m = new Guards("迈克尔泪滴");
        m.attack();
        Player ym = new Translator("姚明");
        ym.attack();
        ym.defense();
    }
}
