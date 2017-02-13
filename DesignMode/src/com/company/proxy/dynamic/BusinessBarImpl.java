package com.company.proxy.dynamic;

/**
 * Created by hasee on 2017/2/12.
 */
public class BusinessBarImpl implements BusinessBar {
    @Override
    public String bar(String message) {
        System.out.println("BusinessBarImpl.bar()");
        return message;
    }
    @Override
    public String bar2(String message) {
        System.out.println("BusinessBarImpl.bar2()");
        return message;
    }
}
