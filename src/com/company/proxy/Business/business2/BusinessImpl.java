package com.company.proxy.Business.business2;

/**
 * Created by hasee on 2017/2/12.
 * 真实实现业务逻辑的角色
 */
public class BusinessImpl implements Business  {
    @Override
    public void doAction() {
        System.out.println("真实角色中业务方法被执行");
    }
}
