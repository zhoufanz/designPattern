package com.company.observer.jdk;

import java.util.Observable;

/**
 * Created by hasee on 2017/2/12.
 */
public class WeatherSubject extends Observable {
    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
        this.setChanged();
        //this.notifyObservers();
        this.notifyObservers(content);
    }
}
