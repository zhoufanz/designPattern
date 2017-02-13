package com.company.strategy.impl;

import com.company.strategy.FlyingStrategy;

/**
 * Created by hasee on 2017/2/3.
 */
public class FlyNoWay implements FlyingStrategy {
    @Override
    public void performFly() {
        System.out.println("不会飞");
    }
}
