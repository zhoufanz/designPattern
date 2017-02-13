package com.company.observer;

/**
 * Created by hasee on 2017/2/12.
 * 具体的观者者对象,实现更新的方法
 */
public class ConcreteObserver implements Observer {

    public String getObserverStatus() {
        return observerStatus;
    }

    public void setObserverStatus(String observerStatus) {
        this.observerStatus = observerStatus;
    }

    private String observerStatus;
    @Override
    public void update(Subject subject) {
        String subjectStatus = ((ConcreteSubject) subject).getSubjectStatus();
    }
}
