package com.company.strategy;

/**
 * Created by hasee on 2017/2/3.
 */
public class MallardDuck extends Duck{
    @Override
    public void display() {
        System.out.println("野鸭子");
    }

    public MallardDuck() {
        super();
        super.setFlyingStrategy(new FlyingStrategyImpl());
    }
}
