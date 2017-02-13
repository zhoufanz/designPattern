package com.company.factory;

/**
 * Created by hasee on 2017/2/13.
 */
public class Client {
    public static void main(String[] args) {
        ComputerEngineer computerEngineer = new ComputerEngineer(1, 2);
        computerEngineer.getCpu().calculate();
        computerEngineer.getMainboard().installCPU();
    }
}
