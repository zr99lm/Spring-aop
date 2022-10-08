package com.zr.Proxy.staticProxy;

public class MarryProxyTest {
    public static void main(String[] args) {
        MarryCompany com1=new MarryCompany();
        com1.setNewPeople(new NewPeople("haha"));
        com1.toMarry();
    }
}
