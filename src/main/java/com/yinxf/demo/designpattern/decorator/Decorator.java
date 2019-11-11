package com.yinxf.demo.designpattern.decorator;

/**
 * @author yinxf
 * @Date 2019/10/30
 * @Description
 **/
public abstract class Decorator extends Component {
    protected  Component component;

    public void setComponent(Component component) {
        this.component = component;
    }

    @Override
    public void operation() {
        if (component != null){
            component.operation();
        }
    }
}
