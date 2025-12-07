package com.upgrad.designpatterns.principles.lsp.good;


public class AnimalDemo {
    public static void main(String[] args) {
        Animal simba = new Lion();
        Animal maximus = new Horse();

        simba.eat();
        maximus.eat();
    }

}
