package com.company.adapter;

/**
 * Created by hasee on 2017/2/3.
 * 三孔电源笔记本 客户端
 */
public class NoteBook {
    private ThreePlugInterface threePlugInterface;

    public NoteBook(ThreePlugInterface threePlugInterface){
        this.threePlugInterface=threePlugInterface;
    }
    public void charge(){
        threePlugInterface.powerWithThree();
    }
}
