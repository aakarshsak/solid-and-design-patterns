package com.upgrad.designpatterns.principles.ocp.bad;


public abstract class MenuItem {
    private Double price;

    public MenuItem(Double price) {
        this.price = price;
    }

    public Double getPrice() {
        return this.price;
    }

    public abstract void prepare();

}
