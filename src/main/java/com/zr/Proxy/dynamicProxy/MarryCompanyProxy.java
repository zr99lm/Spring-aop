package com.zr.Proxy.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MarryCompanyProxy implements InvocationHandler {
    private Object object;

    public MarryCompanyProxy(Object object) {
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("==before==");
        Object invoke = method.invoke(object,args);
        System.out.println(method);
        System.out.println("==after==");
        return invoke;
    }
}