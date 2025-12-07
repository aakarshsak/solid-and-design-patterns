package com.upgrad.designpatterns.principles.srp;


public class CustomerMultiResponsibility {
    private String name;
    private Float balance;

    public CustomerMultiResponsibility(String name, Float balance) {
        this.name = name;
        this.balance = balance;
    }

    public Float getBalance() {
        return this.balance;
    }

    public void transact(Float amt) {
        this.balance += amt;
    }

}
