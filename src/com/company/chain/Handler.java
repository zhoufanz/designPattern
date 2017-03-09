package com.company.chain;

/**
 * Created by hasee on 2017/2/13.
 */
public abstract class Handler {

    protected Handler successor;

    public Handler getSuccessor() {
        return successor;
    }

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    public abstract void handleRequest();
}
