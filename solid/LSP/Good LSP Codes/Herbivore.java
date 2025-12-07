package com.upgrad.designpatterns.principles.lsp.good;


public abstract class Herbivore extends Animal {
    public void eat() {
        this.eatGrass();
    }

    public abstract void eatGrass();

}
