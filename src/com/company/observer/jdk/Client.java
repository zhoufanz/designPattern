package com.company.observer.jdk;

/**
 * Created by hasee on 2017/2/12.
 */
public class Client {
    public static void main(String[] args) {
        WeatherSubject weatherSubject=new WeatherSubject();

        WeatherObserver w1=new WeatherObserver();
        w1.setObserverName("girl");

        WeatherObserver w2=new WeatherObserver();
        w2.setObserverName("mam");

        weatherSubject.addObserver(w1);
        weatherSubject.addObserver(w2);

        weatherSubject.setContent("晴天");

    }
}
