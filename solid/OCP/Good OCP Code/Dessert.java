package com.upgrad.designpatterns.principles.ocp.good;


public class Dessert extends MenuItem {
    public Dessert(Double price) {
        super(price);
    }

    public void prepare() {
        this.bake();
    }

    public void bake() {
        System.out.println("Prepared Dessert");
    }

}
