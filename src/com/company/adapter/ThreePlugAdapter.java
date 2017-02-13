package com.company.adapter;

/**
 * Created by hasee on 2017/2/3.
 * 组合
 * 三孔线板适配器 实现 三孔设备供电
 */
public class ThreePlugAdapter implements ThreePlugInterface {

    private TwoPlug twoPlug;
    public ThreePlugAdapter(TwoPlug twoPlug){
        this.twoPlug=twoPlug;
    }
    @Override
    public void powerWithThree() {
        System.out.println("二孔线板转化成三孔");
        twoPlug.powerWithTwo();
        System.out.println();
    }
}
