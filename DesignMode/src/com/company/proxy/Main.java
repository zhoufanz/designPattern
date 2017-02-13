package com.company.proxy;

/**
 * Created by hasee on 2017/2/4.
 */
public class Main {
    public static void main(String[] args) {
       /* Car car=new Car();
        car.move();*/
     /*  Moveable m=new Car2();
        m.move();*/
        CarTimeProxy car3 = new CarTimeProxy(new Car());
        CarLogProxy carLogProxy = new CarLogProxy(car3);
        carLogProxy.move();
    }
}
