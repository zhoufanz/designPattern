package com.company.factory;

/**
 * Created by hasee on 2017/2/13.
 */
public class MainboardFactory {
    public static Mainboard create(int type){
        Mainboard mainboard=null;
        if (type==1){
            mainboard = new IntelMainboard(111);
        }else if (type==2){
            mainboard = new AmdMainboard(34344);
        }
        return mainboard;
    }
}
