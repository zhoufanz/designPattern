package com.company.observer.weather;

/**
 * Created by hasee on 2017/2/12.
 *
 */
public class Test {
    public static void main(String[] args) {
        WeatherConcreteSubject weatherConcreteSubject=new WeatherConcreteSubject();

        WeatherConcreteObserver w1=new WeatherConcreteObserver();
        w1.setNotifyMessage("今天要约会");
        w1.setObserverName("girl");

        WeatherConcreteObserver w2=new WeatherConcreteObserver();
        w2.setNotifyMessage("去扫货");
        w2.setObserverName("mama");

        weatherConcreteSubject.attach(w1);
        weatherConcreteSubject.attach(w2);

        weatherConcreteSubject.setWeatherSubjectStatus("晴天");


    }
}
