package com.upgrad.designpatterns.principles.isp.good;


public class Espresso implements Coffee {
    private Double price;

    public Espresso(Double price) {
        this.price = price;
    }

    public Double getPrice() {
        return this.price;
    }

    @Override
    public void addCoffee() {
        System.out.println("Adding Extra Coffee");
        this.price += 0.50;
    }

}
