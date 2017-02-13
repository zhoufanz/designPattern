package com.company.factory;

/**
 * Created by hasee on 2017/2/13.
 */
public class AmdFactroy implements AbstractFactory {
    @Override
    public CPU createCpu() {
        return new AmdCpu(24);
    }

    @Override
    public Mainboard createMainboard() {
        return new AmdMainboard(242);
    }
}
