package com.upgrad.designpatterns.structural.decorator.bad;

public class Fly implements SuperPower {
    @Override
    public String name() {
        return "can Fly";
    }

    @Override
    public Double power() {
        return 200.0;
    }
}
