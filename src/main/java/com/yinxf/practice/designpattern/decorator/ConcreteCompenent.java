package com.yinxf.practice.designpattern.decorator;

/**
 * @author yinxf
 * @Date 2019/10/30
 * @Description
 **/
public class ConcreteCompenent extends Component {
    @Override
    public void operation() {
        System.out.println("具体对象的操作");
    }
}
