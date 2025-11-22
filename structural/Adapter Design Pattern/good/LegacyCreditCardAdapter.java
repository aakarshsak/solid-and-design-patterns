package com.upgrad.designpatterns.structural.adapter.good;

public class LegacyCreditCardAdapter implements CreditCard {
    private CreditCardLegacy cardLegacy;

    public LegacyCreditCardAdapter(CreditCardLegacy cardLegacy) {
        this.cardLegacy = cardLegacy;
    }

    public Double getLimit() {
        return Double.parseDouble(cardLegacy.getLimit());
    }

    public String getType() {
        return cardLegacy.getType();
    }

    public String getCustomerName() {
        return cardLegacy.getCustomer();
    }

    public String getCardNumber() {
        return cardLegacy.getCcNumber();
    }

    @Override
    public String toString() {
        return "LegacyCreditCardAdapter{ " +
                "CC Number: " + getCardNumber() + ", Csutomer: " + getCustomerName() + ", Limit: " + getLimit() + ", Type: " + getType() +
                '}';
    }
}
