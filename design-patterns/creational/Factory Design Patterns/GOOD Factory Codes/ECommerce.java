package com.upgrad.designpatterns.creational.factory.good;


public class ECommerce extends Website {
    @Override
    public void createWebsite() {
        pages.add(new CartPage());
        pages.add(new HomePage());
        pages.add(new SearchPage());
    }
}
