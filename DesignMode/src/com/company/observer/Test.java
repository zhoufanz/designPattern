package com.company.observer;

/**
 * Created by hasee on 2017/2/12.
 */
public class Test {
    public static void main(String[] args) {
        ConcreteSubject subject=new ConcreteSubject();
        for(int i=0;i<3;i++){
            subject.attach(new ConcreteObserver());
        }
        subject.setSubjectStatus("主题状态改变了");
        System.out.println();
    }
}
