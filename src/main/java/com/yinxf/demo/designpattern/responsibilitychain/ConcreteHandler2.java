package com.yinxf.demo.designpattern.responsibilitychain;

/**
 * @author yinxf
 * @Date 2019/11/7
 * @Description
 **/
public class ConcreteHandler2 extends Handler {
    @Override
    public void handlerRequest(int request) {
        if (request >=10 && request < 20){
            System.out.println("10到20处理请求"+request);
        }else if (handler != null){
            handler.handlerRequest(request);
        }
    }
}
