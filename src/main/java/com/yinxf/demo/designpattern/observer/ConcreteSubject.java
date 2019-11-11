package com.yinxf.demo.designpattern.observer;

/**
 * @author yinxf
 * @Date 2019/11/1
 * @Description
 **/
public class ConcreteSubject extends Subject {

    private String subjectState;

    public String getSubjectState() {
        return subjectState;
    }

    public void setSubjectState(String subjectState) {
        this.subjectState = subjectState;
    }
}
