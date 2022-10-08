package com.zr.Proxy.dynamicProxy;

public class MarryImpl implements Marry{
    @Override
    public String toMarry(String name) {
        System.out.println("----toMarry");
        return name+"toMarry====";
    }

    @Override
    public void toMarry() {
        System.out.println("==want to marry==");
    }
}
