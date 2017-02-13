package com.company.observer.weather2;

/**
 * Created by hasee on 2017/2/12.
 */
public class ConcreteWeatherSubject extends WeatherSubject {
    private String weatherContent;

    public String getWeatherContent() {
        return weatherContent;
    }

    public void setWeatherContent(String weatherContent) {
        this.weatherContent = weatherContent;
        notifyObservers();
    }

    @Override
    protected void notifyObservers() {
        for (WeatherObserver observer : observers) {
            String observerName=observer.getObserverName();
            if ("girl".equals(observerName)) {
                if (Weather.RAINY.getValue().equals(weatherContent)){
                    observer.update(this);
                }
            }
            if ("mam".equals(observerName)){
                if (Weather.RAINY.getValue().equals(weatherContent)||Weather.SNOWY.getValue().equals(weatherContent)){
                    observer.update(this);
                }
            }
        }
    }
}
