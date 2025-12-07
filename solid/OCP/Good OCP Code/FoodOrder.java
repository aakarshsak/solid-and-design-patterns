package com.upgrad.designpatterns.principles.ocp.good;

import java.util.ArrayList;
import java.util.List;

public class FoodOrder {
    private final List<MenuItem> items;

    public FoodOrder() {
        this.items = new ArrayList<>();
    }

    public void processOrder() {
        System.out.println("Starting Order Processing");
        this.items.forEach(MenuItem::prepare);
        System.out.println("Order Processed");
    }

    public Double getBill() {
        Double total = 0.0;
        for (MenuItem item : this.items) {
            total += item.getPrice();
        }
        return total;
    }

    public void addMenuItem(MenuItem item) {
        this.items.add(item);
    }

}
