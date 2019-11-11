package com.yinxf.practice.designpattern.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yinxf
 * @Date 2019/11/11
 * @Description
 **/
public class ObjectStructure {

    private List<Element> elements = new ArrayList<>();

    public void attach(Element element){
        elements.add(element);
    }

    public void detach(Element element){
        elements.remove(element);
    }
    public void accept(Visitor visitor){
        for (Element element : elements) {
            element.accept(visitor);
        }
    }
}
