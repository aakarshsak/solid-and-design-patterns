package com.upgrad.designpatterns.principles.lsp.good;


public class Horse extends Herbivore {
    public void eatGrass() {
        System.out.println("I'm a Horse and I'm eating Grass.");
    }

    @Override
    public void eat() {
        this.eatGrass();
    }
}
