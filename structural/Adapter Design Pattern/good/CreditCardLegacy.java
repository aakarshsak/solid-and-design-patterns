package com.upgrad.designpatterns.structural.adapter.good;


public class CreditCardLegacy {
    private String ccNumber;
    private String customer;
    private String type;
    private String limit;

    public CreditCardLegacy(String ccNumber, String customer, String type, String limit) {
        this.ccNumber = ccNumber;
        this.customer = customer;
        this.type = type;
        this.limit = limit;
    }

    public String getCcNumber() {
        return this.ccNumber;
    }

    public String getCustomer() {
        return this.customer;
    }

    public String getType() {
        return this.type;
    }

    public String getLimit() {
        return this.limit;
    }
}
