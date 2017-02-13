package com.company.observer.weather2;

/**
 * Created by hasee on 2017/2/12.
 */
public interface WeatherObserver {
    public void update(WeatherSubject weatherSubject);

    public void setObserverName(String observerName);

    public String getObserverName();
}
