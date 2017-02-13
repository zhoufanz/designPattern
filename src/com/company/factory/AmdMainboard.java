package com.company.factory;

/**
 * Created by hasee on 2017/2/13.
 */
public class AmdMainboard implements Mainboard {
    private int cpuHoles=0;

    public AmdMainboard(int cpuHoles) {
        this.cpuHoles = cpuHoles;
    }

    @Override
    public void installCPU() {
        System.out.println("Amd主板的cpu插槽孔数是: "+cpuHoles);
    }
}
