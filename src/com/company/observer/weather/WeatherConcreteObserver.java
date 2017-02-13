package com.company.observer.weather;

/**
 * Created by hasee on 2017/2/12.
 */
public class WeatherConcreteObserver implements  WeatherObserver {
    private String observerName;

    public String getObserverName() {
        return observerName;
    }

    public void setObserverName(String observerName) {
        this.observerName = observerName;
    }

    public String getNotifyMessage() {
        return notifyMessage;
    }

    public void setNotifyMessage(String notifyMessage) {
        this.notifyMessage = notifyMessage;
    }

    public String getObserverStatus() {
        return observerStatus;
    }

    public void setObserverStatus(String observerStatus) {
        this.observerStatus = observerStatus;
    }

    private String notifyMessage;
    private String observerStatus;

    @Override
    public void update(WeatherSubject weatherSubject) {
        String weatherSubjectStatus = ((WeatherConcreteSubject) weatherSubject).getWeatherSubjectStatus();
        this.setObserverStatus(weatherSubjectStatus);
        System.out.println(observerName+":你好! 今天的天气是: "+observerStatus+","+notifyMessage);
    }
}
