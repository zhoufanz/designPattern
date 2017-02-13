package com.company.observer;

/**
 * Created by hasee on 2017/2/12.
 * 具体的目标对象 负责把有关状态存入到相应的观察者对象中
 */
public class ConcreteSubject extends Subject{
    public String getSubjectStatus() {
        return subjectStatus;
    }

    public void setSubjectStatus(String subjectStatus) {
        this.subjectStatus = subjectStatus;
        this.notifyObservers();
    }

    //目标对象的状态
    private String subjectStatus;
}
