package com.upgrad.designpatterns.creational.builder.bad;


public class PizzaDemo {
    public static void main(String... args) {
        Pizza pizza = new Pizza();

        pizza.setBase("Cheese Burst");
        pizza.setDressing("Marinara");
        pizza.setMeat("Chicken");

        System.out.println(pizza.getBase());
        System.out.println(pizza.getDressing());
        System.out.println(pizza.getMeat());

        PizzaTelescoping pizzaTelescoping = new PizzaTelescoping("Cheese Burst", "Marinara", "Chicken");

        System.out.println(pizzaTelescoping.getBase());
        System.out.println(pizzaTelescoping.getDressing());
        System.out.println(pizzaTelescoping.getMeat());
    }
}
