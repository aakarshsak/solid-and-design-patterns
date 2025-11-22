package com.upgrad.designpatterns.structural.adapter.good;

import java.util.List;

public class AdapterDemo {
    public static void main(String[] args) {
        CreditCardClient client = new CreditCardClient();

        List<CreditCard> cards = client.getCreditCards();

        System.out.println("CREDIT CARD DETAILS:");
        for(CreditCard card: cards){
            System.out.println(card);
        }

    }
}
