package com.upgrad.designpatterns.structural.decorator.good;

public class CanFly implements Hero {
    private Hero hero;

    public CanFly(Hero hero) {
        this.hero = hero;
    }

    @Override
    public String name() {
        return hero.name() + ", Can Fly";
    }

    @Override
    public Double power() {
        return hero.power() + 200.00;
    }
}
