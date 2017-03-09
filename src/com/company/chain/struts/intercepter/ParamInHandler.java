package com.company.chain.struts.intercepter;

import com.company.chain.*;

/**
 * Created by zf on 2017/2/18.
 */
public class ParamInHandler implements HandlerInterface{
    private HandlerInterface successor;
    @Override
    public void handleRequest() {
        System.out.println("通过反射封装入参");

    }

    @Override
    public HandlerInterface getSuccessor() {
        return successor;
    }

    @Override
    public void setSuccessor(HandlerInterface successor) {
        this.successor=successor;
    }
}
