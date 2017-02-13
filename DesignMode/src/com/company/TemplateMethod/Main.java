package com.company.TemplateMethod;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        Beverage2 beverage2;

        beverage2=new Tea();
        beverage2.create();
        System.out.println();
        beverage2=new Coffee();
        beverage2.create();
    }
}
