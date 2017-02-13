package com.company.proxy.Business;

/**
 * Created by hasee on 2017/2/12.
 * 代理角色:自己并未实现业务逻辑接口,而是调用真实角色来实现
 */
public class BusinessImplProxy implements Business {
    private BusinessImpl bi;
    @Override
    public void doAction() {
        if (bi==null)
            bi=new BusinessImpl();
        doBefore();
        bi.doAction();
        doAfter();
    }
    public void doBefore(){
        System.out.println("前置处理");
    }
    public void doAfter(){
        System.out.println("后置处理");
    }
}
