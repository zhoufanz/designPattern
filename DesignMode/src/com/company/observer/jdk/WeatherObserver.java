package com.company.observer.jdk;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by hasee on 2017/2/12.
 */
public class WeatherObserver implements Observer {
    private String observerName;
    private String content;

    public String getObserverName() {
        return observerName;
    }

    public void setObserverName(String observerName) {
        this.observerName = observerName;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("推模型 "+observerName+"你好,今天的天气是:"+arg.toString());
        System.out.println("拉模型 "+observerName+"你好,今天的天气是: "+((WeatherSubject)o).getContent());
    }
}
