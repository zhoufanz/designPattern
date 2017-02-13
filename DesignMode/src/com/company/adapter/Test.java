package com.company.adapter;

/**
 * Created by hasee on 2017/2/3.
 */
public class Test {
    public static void main(String[] args) {
        TwoPlug twoPlug=new TwoPlug();
        ThreePlugInterface three = new ThreePlugAdapter(twoPlug);

        NoteBook noteBook = new NoteBook(three);
        noteBook.charge();
        System.out.println();

        three = new ThreePlugAdapter2();
        NoteBook noteBook1 = new NoteBook(three);
        noteBook1.charge();
    }
}
