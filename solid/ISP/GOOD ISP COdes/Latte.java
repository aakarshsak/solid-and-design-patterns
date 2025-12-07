package com.upgrad.designpatterns.principles.isp.good;


public class Latte implements Coffee, MilkBased {
    private Double price;

    public Latte(Double price) {
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

    @Override
    public void addMilk() {
        System.out.println("Adding Extra Milk");
        this.price += 0.20;
    }

}
