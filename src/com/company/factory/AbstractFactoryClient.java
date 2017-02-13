package com.company.factory;

/**
 * Created by hasee on 2017/2/13.
 */
public class AbstractFactoryClient {
    public static void main(String[] args) {
        ComputerEngineer ce=new ComputerEngineer(new AmdFactroy());
        ce.getCpu().calculate();;
        ce.getMainboard().installCPU();

        ComputerEngineer ce2=new ComputerEngineer(new IntelFactory());
        ce2.getCpu().calculate();;
        ce2.getMainboard().installCPU();
    }
}
