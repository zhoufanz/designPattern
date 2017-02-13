package com.company.factory;

/**
 * Created by hasee on 2017/2/13.
 */
public class CpuFactory {
    public static CPU createCpu(int type){
        CPU cpu =null;
        if (type==1)
            cpu = new IntelCPU(755);
        else if(type==2){
            cpu = new AmdCpu(983);
        }
        return cpu;
    }
}
