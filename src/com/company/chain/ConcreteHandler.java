package com.company.chain;

/**
 * Created by hasee on 2017/2/13.
 */
public class ConcreteHandler extends Handler {
    @Override
    public void handleRequest() {
        if (getSuccessor()==null){
            System.out.println("已经处理了");
        }else{
            System.out.println("放行了");
            getSuccessor().handleRequest();
        }
    }
}
