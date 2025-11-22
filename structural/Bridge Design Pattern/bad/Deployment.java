package com.upgrad.designpatterns.structural.bridge.bad;

public abstract class Deployment {
    public Deployment() {
    }

    public abstract Boolean deploy(String env);
    public abstract Boolean removeDeploy(String env);

}
