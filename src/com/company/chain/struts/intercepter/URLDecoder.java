package com.company.chain.struts.intercepter;

/**
 * Created by hasee on 2017/2/13.
 */
public class URLDecoder implements HandlerInterface {
    protected HandlerInterface successor;

    @Override
    public HandlerInterface getSuccessor() {
        return successor;
    }

    @Override
    public void setSuccessor(HandlerInterface successor) {
        this.successor=successor;
    }

    @Override
    public void handleRequest() {
        System.out.println("解析url");

    }
}
