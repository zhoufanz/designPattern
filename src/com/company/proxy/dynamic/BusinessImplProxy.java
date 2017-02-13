package com.company.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import static sun.net.www.protocol.http.AuthCacheValue.Type.Proxy;

/**
 * Created by hasee on 2017/2/12.
 * 动态角色 动态生成代理类
 */
public class BusinessImplProxy implements InvocationHandler {

    private Object obj;

    public BusinessImplProxy() {
    }

    public BusinessImplProxy(Object obj) {
        this.obj = obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result=null;
        doBefore();
        result=method.invoke(obj,args);
        doAfter();
        System.out.println();
        return result;
    }
    public void doBefore(){
        System.out.println("before");
    }
    public void doAfter(){
        System.out.println("after");
    }

    public static Object factory(Object obj){
        Class cls=obj.getClass();
        Object o = java.lang.reflect.Proxy.newProxyInstance(cls.getClassLoader(), cls.getInterfaces(), new BusinessImplProxy(obj));
        return o;

    }
}
