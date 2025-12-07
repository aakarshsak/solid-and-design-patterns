package com.upgrad.designpatterns.structural.bridge.bad;

public class LinuxDeployment extends Deployment{

    @Override
    public Boolean deploy(String env) {
        return null;
    }

    @Override
    public Boolean removeDeploy(String env) {
        return null;
    }
}
