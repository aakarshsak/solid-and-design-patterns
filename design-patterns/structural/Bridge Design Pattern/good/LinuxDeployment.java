package com.upgrad.designpatterns.structural.bridge.good;

public class LinuxDeployment extends Deployment {

    public LinuxDeployment(Bit bit) {
        super(bit);
    }

    @Override
    public void deploy() {
        System.out.println("Deploy Linux");
        bit.deploy();
    }

    @Override
    public void removeDeploy() {
        System.out.println("Remove Deploy Linux");
    }
}
