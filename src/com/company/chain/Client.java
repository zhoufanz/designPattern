package com.company.chain;

/**
 * Created by hasee on 2017/2/13.
 * 这是1.0分支特有的
 * //
 */
public class Client {
    public static void main(String[] args) {
        ConcreteHandler h1=new ConcreteHandler();
        ConcreteHandler h2=new ConcreteHandler();
        ConcreteHandler h3 =new ConcreteHandler();
        h3.setSuccessor(h2);
        h2.setSuccessor(h1);

        h3.handleRequest();
    }
}
