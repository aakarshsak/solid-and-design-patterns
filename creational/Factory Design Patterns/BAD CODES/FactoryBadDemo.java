package com.upgrad.designpatterns.creational.factory.bad;


public class FactoryBadDemo {
    public static void main(String[] args) {

        Website site = new Website("ECommerce");

        System.out.println(site.getPages());

        site = new Website("Blog");

        System.out.println(site.getPages());
    }
}
