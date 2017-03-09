package com.company.chain.struts.intercepter;

import com.company.chain.ConcreteHandler;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by hasee on 2017/2/13.
 * 这是1.0分支特有的
 * //
 */
public class Client {
    public static void main(String[] args) {
       ParamInHandler paramInHandler=new ParamInHandler();

        URLDecoder urlDecoder =new URLDecoder();

        urlDecoder.setSuccessor(paramInHandler);

        HandlerInterface handlerProx1= (HandlerInterface) Proxy.newProxyInstance(urlDecoder.getClass().getClassLoader(), urlDecoder.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                return method.invoke(urlDecoder, args);
            }
        });
        handlerProx1.handleRequest();
        if (handlerProx1.getSuccessor()==null){
            System.out.println("责任链结束了");
        }else{
            handlerProx1.getSuccessor().handleRequest();
        }

    }
}
