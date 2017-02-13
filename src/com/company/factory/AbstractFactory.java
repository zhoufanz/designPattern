package com.company.factory;

/**
 * Created by hasee on 2017/2/13.
 */
public interface AbstractFactory {
    CPU createCpu();
    Mainboard createMainboard();
}
