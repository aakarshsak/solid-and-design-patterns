package com.upgrad.designpatterns.principles.ocp.bad;

public class Demo {
    public static void main(String[] args) {
        MenuItem dessert = new MainCourse(2.99);
        MenuItem mainCourse = new MainCourse(5.99);

        FoodOrderRAW order = new FoodOrderRAW();

        order.addMainCourse(mainCourse);
        order.addMainCourse(dessert);

        order.processOrder();
        System.out.println("The Bill is: " + order.getBill());
    }
}
