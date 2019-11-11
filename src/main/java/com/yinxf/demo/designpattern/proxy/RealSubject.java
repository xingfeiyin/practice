package com.yinxf.demo.designpattern.proxy;

/**
 * @author yinxf
 * @Date 2019/10/30
 * @Description
 **/
public class RealSubject extends Subject {
    @Override
    public void request() {
        System.out.println("真实的请求");
    }
}
