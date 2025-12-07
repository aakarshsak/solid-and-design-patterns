package com.upgrad.designpatterns.principles.srp;


public class Customer {
    private String name;
    private Account account;

    public Customer(String name, Account account) {
        this.name = name;
        this.account = account;
    }

    public String getName() {
        return this.name;
    }

    public Account getAccount() {
        return this.account;
    }

}
