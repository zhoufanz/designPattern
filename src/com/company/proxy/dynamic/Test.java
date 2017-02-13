package com.company.proxy.dynamic;

/**
 * Created by hasee on 2017/2/12.
 */
public class Test {
    public static void main(String[] args) {
        BusinessFoo bfoo = new BusinessFooImpl();
        BusinessFoo bf = (BusinessFoo) BusinessImplProxy.factory(bfoo);
        bf.foo();
        System.out.println();

        BusinessBar bbar = new BusinessBarImpl();
        BusinessBar bb = (BusinessBar) BusinessImplProxy.factory(bbar);
        bb.bar2("fffff");
        System.out.println();
    }
}
