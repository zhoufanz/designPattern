package com.company.strategy;

/**
 * Created by hasee on 2017/2/3.
 */
public class RubberDuck extends Duck {
    @Override
    public void display() {
        System.out.println("橡胶鸭");
    }
    public RubberDuck() {
        super();
        super.setFlyingStrategy(new FlyNoWay());
    }
}
