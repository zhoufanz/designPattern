package com.company.proxy.JdkProxy;

import com.company.proxy.Moveable;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by hasee on 2017/2/4.
 */
public class TimeHandler implements InvocationHandler {
    private Object target;

    public TimeHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        long startTime=System.currentTimeMillis();
        System.out.println("汽车开始行驶");

        method.invoke(target);

        long endTime=System.currentTimeMillis();
        long costTime=endTime-startTime;
        System.out.println("汽车总行驶时间: "+costTime);
        return null;
    }
}
