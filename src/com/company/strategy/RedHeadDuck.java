package com.company.strategy;

/**
 * Created by hasee on 2017/2/3.
 */
public class RedHeadDuck extends Duck{
    @Override
    public void display() {
        System.out.println("红头鸭");
    }

    public RedHeadDuck() {
        super();
        super.setFlyingStrategy(new FlyingStrategyImpl());
    }
}
