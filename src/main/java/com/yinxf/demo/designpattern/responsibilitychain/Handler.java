package com.yinxf.demo.designpattern.responsibilitychain;

/**
 * @author yinxf
 * @Date 2019/11/7
 * @Description
 **/
public abstract class Handler {

    protected  Handler handler;

    public void setHandler(Handler handler) {
        this.handler = handler;
    }

    public abstract void handlerRequest(int request);
}
