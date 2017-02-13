package com.company.observer.weather2;

/**
 * Created by hasee on 2017/2/12.
 */
public class Client {
    public static void main(String[] args) {
        ConcreteWeatherSubject subject=new ConcreteWeatherSubject();

        ConcreteWeatherObserver observer=new ConcreteWeatherObserver();
        observer.setObserverName("girl");

        ConcreteWeatherObserver observer2=new ConcreteWeatherObserver();
        observer2.setObserverName("mam");

        subject.attach(observer);
        subject.attach(observer2);

        subject.setWeatherContent("晴天");
        System.out.println();
        subject.setWeatherContent("雨天");
        System.out.println();
        subject.setWeatherContent("雪天");

    }
}
