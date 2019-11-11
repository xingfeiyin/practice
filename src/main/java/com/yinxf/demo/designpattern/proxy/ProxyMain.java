package com.yinxf.demo.designpattern.proxy;

/**
 * @author yinxf
 * @Date 2019/10/30
 * @Description 代理模式
 *
 * 第一，远程代理，也就是为一个对象在不同的地址空间提供局部代表，这样可以隐藏一个对象存在于不同地址空间的事实。
 * 第二，虚拟代理，是根据需要创建开销很大的对象，通过它来存放实例化需要很长时间的真是对象。
 * 第三，安全代理，用来控制真实对象访问时的控制权限。
 * 第四，智能指引，是指当调用真实的对象时，代理处理另外一些事。
 **/
public class ProxyMain {

    public static void main(String[] args) {
        Proxy proxy = new Proxy();
        proxy.request();
    }
}
