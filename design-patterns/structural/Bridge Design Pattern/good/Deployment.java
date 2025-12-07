package com.upgrad.designpatterns.structural.bridge.good;

public abstract class Deployment {
    protected Bit bit;
    public Deployment(Bit bit) {
        this.bit = bit;
    }

    public abstract void deploy();
    public abstract void removeDeploy();

}
