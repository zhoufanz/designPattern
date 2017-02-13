package com.company.observer.weather2;

/**
 * Created by hasee on 2017/2/12.
 */
public class ConcreteWeatherObserver implements WeatherObserver {
    private String observerName;
    private String weatherContent;
    @Override
    public void update(WeatherSubject weatherSubject) {
        weatherContent=((ConcreteWeatherSubject)weatherSubject).getWeatherContent();
        System.out.println(observerName+": "+weatherContent);
    }

    @Override
    public void setObserverName(String observerName) {
        this.observerName=observerName;
    }

    @Override
    public String getObserverName() {
        return this.observerName;
    }
}
