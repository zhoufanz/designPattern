package com.company.proxy.JdkProxy;

import com.company.proxy.Car;
import com.company.proxy.Moveable;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * Created by hasee on 2017/2/4.
 */
public class Test {
    public static void main(String[] args) {
        Car car = new Car();
        InvocationHandler h=new TimeHandler(car);
        Class<? extends Car> carClass = car.getClass();

        Moveable moveable=(Moveable)Proxy.newProxyInstance(carClass.getClassLoader(),carClass.getInterfaces(),h);
        moveable.move();

    }
}
