package com.company.proxy;

/**
 * Created by hasee on 2017/2/4.
 */
public class Car2 extends  Car {
    @Override
    public void move() {
        long startTime=System.currentTimeMillis();
        System.out.println("汽车开始行驶");
        super.move();
        long endTime=System.currentTimeMillis();
        long costTime=endTime-startTime;
        System.out.println("汽车总行驶时间: "+costTime);
    }
}
