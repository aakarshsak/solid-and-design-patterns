package com.upgrad.designpatterns.structural.bridge.good;

public class BridgeDemo {
    public static void main(String[] args) {
        Bit bit1 = new Bit64();
        Deployment deployment1 = new LinuxDeployment(bit1);

        Bit bit2 = new Bit32();
        Deployment deployment2 = new MacDeployment(bit2);

        deployment1.deploy();
        deployment1.removeDeploy();

        deployment2.deploy();
        deployment2.removeDeploy();
    }
}
