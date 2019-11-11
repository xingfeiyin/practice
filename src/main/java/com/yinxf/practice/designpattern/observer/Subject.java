package com.yinxf.practice.designpattern.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yinxf
 * @Date 2019/11/1
 * @Description
 **/
public abstract class Subject {
    private List<Observer> observers = new ArrayList<>();

    public void attach(Observer observer){
        observers.add(observer);
    }

    public void detach(Observer observer){
        observers.remove(observer);
    }

    public void notifyObserver(){
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
