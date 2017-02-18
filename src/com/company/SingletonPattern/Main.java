package com.company.SingletonPattern;

/**
 * Created by hasee on 2017/2/3.
 */
public class Main {
    public static void main(String[] args) {
        Singleton singleton=Singleton.getInstance();
        Singleton singleton1=Singleton.getInstance();
        System.out.println(singleton.equals(singleton1));

        System.out.println();

        Singleton2 singleton2=Singleton2.getInsance();
        Singleton2 singleton21=Singleton2.getInsance();
        System.out.println(singleton2.equals(singleton21));
        String s = "123";
        String s2 = new String("123");
        System.out.println(s==s2);
        System.out.println(s.equals(s2));

    }
}
