package com.upgrad.designpatterns.principles.lsp.bad;


public class AnimalDemo {
    public static void main(String[] args) throws Exception {
        Animal maximusTheHorse = new Horse();

        System.out.println("Maximus, The Horse: ");
        maximusTheHorse.eatGrass();

        Animal simbaTheLion = new Lion();

        System.out.println("Simba, The Lion: ");
        simbaTheLion.eatGrass(); // This doesn't seem right, does it ?
    }

}
