package com.upgrad.designpatterns.principles.ocp.bad;

public class MainCourse extends MenuItem {
    public MainCourse(Double price) {
        super(price);
    }

    @Override
    public void prepare() {
        System.out.println("Prepared Main Course");
    }

}
