package com.upgrad.designpatterns.principles.ocp.bad;

import java.util.ArrayList;
import java.util.List;

public class FoodOrderRAW {
    private final List<MenuItem> mainCourseItems;

    public FoodOrderRAW() {
        this.mainCourseItems = new ArrayList<>();
    }

    public void processOrder() {
        System.out.println("Starting Order Processing");

        for (MenuItem item : this.mainCourseItems) {
            item.prepare();
        }

        System.out.println("Order Processed");
    }

    public Double getBill() {
        Double total = 0.0;
        for (MenuItem item : this.mainCourseItems) {
            total += item.getPrice();
        }

        return total;
    }

    public void addMainCourse(MenuItem item) {
        this.mainCourseItems.add(item);
    }

}
