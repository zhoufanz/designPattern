package com.company.proxy.Business.business2;

/**
 * Created by hasee on 2017/2/12.
 * 代理角色 本身没有实现业务逻辑 通过调用真实角色实现业务逻辑
 */
public class BusinessImplProxy implements Business {
    private Business business;
    @Override
    public void doAction() {
        if (business==null)
            business=new BusinessImpl();
        doBefore();
        business.doAction();
        doAfter();
    }
    public void doBefore(){
        System.out.println("前置处理");
    }
    public void doAfter(){
        System.out.println("后置处理");
    }
}
