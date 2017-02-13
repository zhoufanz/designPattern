package com.company.SingletonPattern;

/**
 * Created by hasee on 2017/2/3.
 * 懒汉式 获得对象时多一个if判断 ,第一次获得创建对象,线程不安全
 */
public class Singleton2 {
    private Singleton2(){}

    private static Singleton2 instance;
    public static Singleton2 getInsance(){
        if (instance==null){
            instance=new Singleton2();
        }
        return instance;
    }
}
