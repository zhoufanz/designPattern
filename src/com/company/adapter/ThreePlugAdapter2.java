package com.company.adapter;

/**
 * Created by hasee on 2017/2/3.
 * 继承
 */
public class ThreePlugAdapter2 extends TwoPlug implements ThreePlugInterface {
    @Override
    public void powerWithThree() {
        System.out.println("通过继承的方式适配3孔插板");
        powerWithTwo();
    }
}
