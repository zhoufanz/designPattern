package com.company.proxy.Business;

/**
 * Created by hasee on 2017/2/12.
 * 真实角色:真正实现了业务逻辑接口
 */
public class BusinessImpl implements Business {
    @Override
    public void doAction() {
        System.out.println("真实角色中方法被执行");
    }
}
