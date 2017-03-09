package com.company.strategy;

import com.company.strategy.FlyingStrategy;

/**
 * Created by hasee on 2017/2/3.
 */
public class FlyingStrategyImpl implements FlyingStrategy{
    @Override
    public void performFly() {
        System.out.println("正翅高飞");
    }
}
