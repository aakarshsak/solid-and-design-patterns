package com.upgrad.designpatterns.principles.isp.good;


public class CoffeeDemo {
    public static void main(String[] args) {
        Latte latte = new Latte(1.99);

        System.out.println("***************************** \n\n");
        System.out.println("Preparing Latte.");
        latte.addCoffee();
        try {
            latte.addMilk();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        double value = 200.3456;
        System.out.printf("Your total is: %.2f \n", latte.getPrice());
        System.out.println("Thank you for Visiting!!!");


        Coffee esp = new Espresso(1.49);
        System.out.println("***************************** \n\n");
        System.out.println("Preparing Espresso.");
        esp.addCoffee();

        System.out.printf("Your total is: %.2f \n", esp.getPrice());
        System.out.println("Thank you for Visiting!!!");
    }

}
