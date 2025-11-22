package com.upgrad.designpatterns.structural.bridge.good;

public class MacDeployment extends Deployment {

    public MacDeployment(Bit bit) {
        super(bit);
    }

    @Override
    public void deploy() {
        System.out.println("Deploy Mac");
        bit.deploy();
    }

    @Override
    public void removeDeploy() {
        System.out.println("Remove Deploy Mac");
    }
}
