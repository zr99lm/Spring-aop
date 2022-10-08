package com.zr.Proxy.staticProxy;

public class MarryCompany implements Marry{

    private NewPeople newPeople;


    public void setNewPeople(NewPeople newPeople) {
        this.newPeople = newPeople;
    }

    @Override
    public void toMarry() {
        System.out.println("===happy===");
        newPeople.toMarry();
        System.out.println("百年好合");
    }
}
