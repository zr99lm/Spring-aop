package com.zr.Proxy.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class TestDynamicProxy {
    public static void main(String[] args) {
        Marry marryImpl=new MarryImpl();
        InvocationHandler handler=new MarryCompanyProxy(marryImpl);
        ClassLoader loader=marryImpl.getClass().getClassLoader();
        Class[] interfaces=marryImpl.getClass().getInterfaces();
        Marry marry=(Marry) Proxy.newProxyInstance(loader,interfaces,handler);
        String s=marry.toMarry("haha");
        marry.toMarry();
        System.out.println(s);
    }
}
