package com.upgrad.designpatterns.structural.adapter.good;

public class CreditCardDB implements CreditCard {
    private Double limit;
    private String type;
    private String customerName;
    private String cardNumber;

    public CreditCardDB(Double limit, String type, String customerName, String cardNumber) {
        this.limit = limit;
        this.type = type;
        this.customerName = customerName;
        this.cardNumber = cardNumber;
    }

    public Double getLimit() {
        return limit;
    }

    public String getType() {
        return type;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public String toString() {
        return "CC Number: " + cardNumber + ", Csutomer: " + customerName + ", Limit: " + limit + ", Type: " + type;
    }
}
