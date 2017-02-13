package com.company.factory;

/**
 * Created by hasee on 2017/2/13.
 */
public class ComputerEngineer {
    private CPU cpu;
    private Mainboard mainboard;

    public ComputerEngineer() {
    }

    public ComputerEngineer(int cupType,int mainboardType) {
        this.cpu = CpuFactory.createCpu(cupType);
        this.mainboard = MainboardFactory.create(mainboardType);
    }
    public ComputerEngineer(AbstractFactory abstractFactory) {
        this.cpu = abstractFactory.createCpu();
        this.mainboard = abstractFactory.createMainboard();
    }


    public CPU getCpu() {
        return cpu;
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    public Mainboard getMainboard() {
        return mainboard;
    }

    public void setMainboard(Mainboard mainboard) {
        this.mainboard = mainboard;
    }
}
