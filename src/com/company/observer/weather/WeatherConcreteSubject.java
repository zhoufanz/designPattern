package com.company.observer.weather;

/**
 * Created by hasee on 2017/2/12.
 */
public class WeatherConcreteSubject extends WeatherSubject {
    private String weatherSubjectStatus;

    public String getWeatherSubjectStatus() {
        return weatherSubjectStatus;
    }

    public void setWeatherSubjectStatus(String weatherSubjectStatus) {
        this.weatherSubjectStatus = weatherSubjectStatus;
        this.notifyObservers();
    }
}
