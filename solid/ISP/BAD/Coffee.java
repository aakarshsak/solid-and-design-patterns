package com.upgrad.designpatterns.principles.isp.bad;


public class Coffee {
    private Double price;

    public Coffee(Double price) {
        this.price = price;
    }

    public Double getPrice() {
        return this.price;
    }

    public void addMilk() throws Exception {
        System.out.println("Adding Extra Milk");
        this.price += 0.20;
    }

    public void addCoffee() {
        System.out.println("Adding Extra Coffee");
        this.price += 0.50;
    }

}
