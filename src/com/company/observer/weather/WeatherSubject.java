package com.company.observer.weather;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hasee on 2017/2/12.
 */
public class WeatherSubject {
    private List<WeatherObserver> weatherObservers = new ArrayList<>();

    public List<WeatherObserver> getWeatherObservers() {
        return weatherObservers;
    }

    public void setWeatherObservers(List<WeatherObserver> weatherObservers) {
        this.weatherObservers = weatherObservers;
    }

    public void attach(WeatherObserver weatherObserver){
        weatherObservers.add(weatherObserver);
    }
    public void detach(WeatherObserver weatherObserver){
        weatherObservers.remove(weatherObserver);
    }

    protected void notifyObservers(){
        for (WeatherObserver weatherObserver : weatherObservers) {
            weatherObserver.update(this);
        }
    }

}
