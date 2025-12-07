package com.upgrad.designpatterns.principles.srp;


public class Account {
    private String accountNumber;
    private Double balance;

    public Account(Double balance, String accountNumber) {
        this.balance = balance;
        this.accountNumber = accountNumber;
    }

    public String getAccountNumber() {
        return this.accountNumber;
    }

    public Double getBalance() {
        return this.balance;
    }

    public void transact(Double amt) {
        if (amt > 0) {
            this.balance += amt;
        } else {
            if ((this.balance + amt) > 0) {
                this.balance += amt;
            }
        }
    }

}
