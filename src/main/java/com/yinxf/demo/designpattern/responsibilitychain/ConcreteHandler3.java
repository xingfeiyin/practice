package com.yinxf.demo.designpattern.responsibilitychain;

/**
 * @author yinxf
 * @Date 2019/11/7
 * @Description
 **/
public class ConcreteHandler3 extends Handler {
    @Override
    public void handlerRequest(int request) {
        if (request >=20 && request < 30){
            System.out.println("20到30处理请求"+request);
        }else if (handler != null){
            handler.handlerRequest(request);
        }
    }
}
