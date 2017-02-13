package com.company.SingletonPattern;

/**
 * Created by hasee on 2017/2/3.
 * 恶汉式 类加载创建对象,线程安全
 */
public class Singleton {
    private Singleton() {
    }

    private static Singleton instance=new Singleton();

    public static Singleton getInstance(){
        return instance;
    }

}
