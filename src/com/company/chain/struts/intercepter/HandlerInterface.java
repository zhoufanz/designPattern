package com.company.chain.struts.intercepter;

import com.company.chain.Handler;

/**
 * Created by zf on 2017/2/18.
 */
public interface HandlerInterface {
     void handleRequest();
     HandlerInterface getSuccessor();
     void setSuccessor(HandlerInterface successor);
}
