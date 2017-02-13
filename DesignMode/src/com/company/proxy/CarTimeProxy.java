package com.company.proxy;

/**
 * Created by hasee on 2017/2/4.
 */
public class CarTimeProxy implements Moveable{
    public CarTimeProxy() {
    }
    private Moveable car;

    public CarTimeProxy(Moveable car) {
        this.car = car;
    }
    public void move(){
        long startTime=System.currentTimeMillis();
        System.out.println("汽车开始行驶");
        car.move();
        long endTime=System.currentTimeMillis();
        long costTime=endTime-startTime;
        System.out.println("汽车总行驶时间: "+costTime);
    }
}
