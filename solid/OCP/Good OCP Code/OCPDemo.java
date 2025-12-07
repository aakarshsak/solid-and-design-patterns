package com.upgrad.designpatterns.principles.ocp.good;


public class OCPDemo {
    public static void main(String[] args) {
        MenuItem dessert = new Dessert(2.99);
        MenuItem mainCourse = new MainCourse(5.99);

        FoodOrder order = new FoodOrder();

        order.addMenuItem(mainCourse);
        order.addMenuItem(dessert);

        order.processOrder();
        System.out.println("The Bill is: " + order.getBill());
    }

}
