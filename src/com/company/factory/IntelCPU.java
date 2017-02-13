package com.company.factory;

/**
 * Created by hasee on 2017/2/13.
 */
public class IntelCPU implements  CPU {
    private int pins=0;
    public IntelCPU(int pins){
        this.pins=pins;
    }
    @Override
    public void calculate() {
        System.out.println("Intel CPU的脚针数: "+pins);
    }
}
