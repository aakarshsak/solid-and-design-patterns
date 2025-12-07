package com.upgrad.designpatterns.structural.adapter.bad;


import java.util.ArrayList;
import java.util.List;

public class CreditCardClient {
    public List<CreditCard> getCreditCards() {
        List<CreditCard> cards = new ArrayList<>();

        CreditCard card = new CreditCardDB(1000.00, "VISA", "Jack Reacher", "1234 5678 7654 3210");
        cards.add(card);

        card = new CreditCardDB(999.00, "MASTERCARD", "Jane Doe", "9876 5432 1012 3456");
        cards.add(card);
        return cards;
    }
}
