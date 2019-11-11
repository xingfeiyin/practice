package com.yinxf.practice.designpattern.proxy;

/**
 * @author yinxf
 * @Date 2019/10/30
 * @Description
 **/
public class Proxy extends Subject {

    RealSubject realSubject ;

    @Override
    public void request() {
        if (realSubject == null){
            realSubject = new RealSubject();
        }
        realSubject.request();
    }
}
