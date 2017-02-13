package com.company.observer.weather2;

/**
 * Created by hasee on 2017/2/12.
 */
public enum Weather {
    FINE("晴天"),RAINY("雨天"),SNOWY("雪天");

    private String value;
    private Weather(String value){
        this.value=value;
    }
    public String getValue(){
        return value;
    }
}
