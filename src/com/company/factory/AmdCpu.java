package com.company.factory;

/**
 * Created by hasee on 2017/2/13.
 */
public class AmdCpu implements CPU {
    private int pins=0;

    public AmdCpu(int pins) {
        this.pins = pins;
    }

    @Override
    public void calculate() {
        System.out.println("Amd Cpu的脚针数为: "+pins);
    }
}
