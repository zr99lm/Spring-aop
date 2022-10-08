package com.zr.Proxy.staticProxy;

public class NewPeople implements Marry{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public NewPeople(String name) {
        this.name = name;
    }
    @Override
    public void toMarry() {
        System.out.println(getName()+"----结婚");
    }
}
