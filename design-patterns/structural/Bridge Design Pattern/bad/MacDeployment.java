package com.upgrad.designpatterns.structural.bridge.bad;

public class MacDeployment extends Deployment {
    private String env;

    public MacDeployment(String env) {
        this.env = env;
    }

    @Override
    public Boolean deploy(String env) {
        System.out.println("Deploy on Mac");
        return true;
    }

    @Override
    public Boolean removeDeploy(String env) {
        System.out.println("Remove Deploy on Mac " + env);
        return true;
    }
}
