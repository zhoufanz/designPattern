package com.company.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hasee on 2017/2/12.
 * 目标对象,它知道观察它的观察者,并提供添加和删除观察者的接口
 */
public class Subject {
    private List<Observer> observers=new ArrayList<>();

    public void attach(Observer observer){
        observers.add(observer);
    }
    public void detach(Observer observer){
        observers.remove(observer);
    }
    protected void notifyObservers(){
        for (Observer observer : observers) {
            observer.update(this);
        }
    }
}
