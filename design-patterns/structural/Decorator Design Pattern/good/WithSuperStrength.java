package com.upgrad.designpatterns.structural.decorator.good;

public class WithSuperStrength implements Hero {
    private Hero hero;

    public WithSuperStrength(Hero hero) {
        this.hero = hero;
    }

    @Override
    public String name() {
        return hero.name() + ", Super Human Strngth";
    }

    @Override
    public Double power() {
        return hero.power() + 300.00;
    }
}
