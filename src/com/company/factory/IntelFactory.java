package com.company.factory;

/**
 * Created by hasee on 2017/2/13.
 */
public class IntelFactory implements AbstractFactory {
    @Override
    public CPU createCpu() {
        return new IntelCPU(24);
    }

    @Override
    public Mainboard createMainboard() {
        return new IntelMainboard(242);
    }
}
