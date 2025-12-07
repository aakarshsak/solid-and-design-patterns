package com.upgrad.designpatterns.principles.isp.bad;


public class Espresso extends Coffee {
    public Espresso(Double price) {
        super(price);
    }

    @Override
    public void addMilk() throws Exception {
        throw new Exception("This Coffee does not have Milk.");
    }

}
