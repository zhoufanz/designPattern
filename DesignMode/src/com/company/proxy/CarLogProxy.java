package com.company.proxy;

/**
 * Created by hasee on 2017/2/4.
 */
public class CarLogProxy implements Moveable {
    private Moveable m;

    public CarLogProxy(Moveable m) {
        this.m = m;
    }

    @Override
    public void move() {
        System.out.println("记录日志开始");
        m.move();
        System.out.println("记录日志结束");
    }
}
