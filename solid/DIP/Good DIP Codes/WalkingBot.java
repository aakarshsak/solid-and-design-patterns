package com.upgrad.designpatterns.principles.dip.good;


public class WalkingBot implements Bot {
    public void walk() {
        System.out.println("Hi! I'm a Walking robot.");
    }

    @Override
    public void perform() {
        this.walk();
    }
}
