package com.company.strategy;

/**
 * Created by hasee on 2017/2/3.
 */
public class DuckTest {
    public static void main(String[] args) {

        Duck duck1 = new MallardDuck();
        duck1.display();
        duck1.quack();
        duck1.fly();
        System.out.println();

        Duck duck2 =new RedHeadDuck();
        duck2.display();
        duck2.quack();
        duck2.fly();
        System.out.println();

        Duck duck3 = new RubberDuck();
        duck3.display();
        duck3.quack();
        duck3.fly();
        System.out.println();
    }
}
