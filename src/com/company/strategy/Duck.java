package com.company.strategy;

/**
 * Created by hasee on 2017/2/3.
 */
public abstract class Duck {
    public abstract  void display();
    public void quack(){
        System.out.println("嘎嘎嘎");
    }

    public Duck(){}
    private FlyingStrategy flyingStrategy;
    public Duck(FlyingStrategy flyingStrategy){
        this.flyingStrategy=flyingStrategy;
    }

    public void setFlyingStrategy(FlyingStrategy flyingStrategy) {
        this.flyingStrategy = flyingStrategy;
    }
    public void fly(){
        this.flyingStrategy.performFly();
    }
}
