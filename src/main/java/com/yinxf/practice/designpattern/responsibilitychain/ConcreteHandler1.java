package com.yinxf.practice.designpattern.responsibilitychain;

/**
 * @author yinxf
 * @Date 2019/11/7
 * @Description
 **/
public class ConcreteHandler1 extends Handler {
    @Override
    public void handlerRequest(int request) {
        if (request >=0 && request < 10){
            System.out.println("0到10处理请求"+request);
        }else if (handler != null){
            handler.handlerRequest(request);
        }
    }
}
