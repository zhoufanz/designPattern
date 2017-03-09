package com.company.strategy;

/**
 * Created by hasee on 2017/2/3.
 */
public abstract class Duck {
    public abstract  void display();

    private FlyingStrategy flyingStrategy;

    public void quack(){
        System.out.println("嘎嘎嘎");
    }
    public void fly(){
        this.flyingStrategy.performFly();
    }
    public void setFlyingStrategy(FlyingStrategy flyingStrategy) {
        this.flyingStrategy = flyingStrategy;
    }
}
