package com.company.observer.weather2;

import com.company.observer.weather2.WeatherObserver;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hasee on 2017/2/12.
 */
public abstract class WeatherSubject {
    public List<WeatherObserver> observers = new ArrayList<>();
    public void attach(WeatherObserver weatherObserver){
        observers.add(weatherObserver);
    }
    public void detach(WeatherObserver weatherObserver){
        observers.remove(weatherObserver);
    }
    protected abstract void notifyObservers();

}
