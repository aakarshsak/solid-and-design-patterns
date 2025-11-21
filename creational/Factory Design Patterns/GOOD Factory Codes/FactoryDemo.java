package com.upgrad.designpatterns.creational.factory.good;


public class FactoryDemo {
    public static void main(String[] args) {
        Website site = WebsiteFactory.getWebsite("ECommerce");

        System.out.println(site.getPages());

        site = WebsiteFactory.getWebsite("Blog");

        System.out.println(site.getPages());
    }

}
