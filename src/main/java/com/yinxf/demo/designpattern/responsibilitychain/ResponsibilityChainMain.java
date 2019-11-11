package com.yinxf.demo.designpattern.responsibilitychain;

/**
 * @author yinxf
 * @Date 2019/11/7
 * @Description 职责链模式
 *
 * 职责链模式：使多个对象都有机会处理请求，从而避免请求的发送者和接受者之间的耦合关系。将这个对象连成一条链，
 *      并沿着这条链传递该请求，直到有一个对象处理它为止。
 *
 * 好处：
 * 1.当客户提交一个请求时，请求时沿链传递直至有一个对象负责处理它
 * 2.接收者和发送者都没有对方的明确信息，且链中的对象自己也并不知道链的结构，
 *      结果是职责链可简化对象的相互连接，它们仅需保持一个指向其后继者的引用，而不需保持它所有的候选接收者的引用。
 * 3.随时的增加或修改处理一个请求的结构，增强了给对象指派职责的灵活性
 * 4.一个请求极有可能到了链的末端都得不到处理，或者因为没有正确配置而得不到处理。
 *
 **/
public class ResponsibilityChainMain {

    public static void main(String[] args) {
        Handler h1 = new ConcreteHandler1();
        Handler h2 = new ConcreteHandler2();
        Handler h3 = new ConcreteHandler3();
        h1.setHandler(h2);
        h2.setHandler(h3);

        int[] requests = {2,5,14,22,18,3,27,20};

        for (int request : requests) {
            h1.handlerRequest(request);
        }

    }
}
