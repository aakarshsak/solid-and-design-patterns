package com.upgrad.designpatterns.creational.builder.good;


public class BuilderDemo {
    public static void main(String... args) {
        Pizza.Builder builder = new Pizza.Builder();

        builder.base("Cheese Burst").dressing("Marinara").meat("Chicken");

        Pizza pizza = builder.build();

        System.out.println(pizza.getBase());
        System.out.println(pizza.getDressing());
        System.out.println(pizza.getMeat());
    }
}
