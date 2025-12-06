package com.upgrad.designpatterns.behavioral.chain.good;

public class WarningLogger extends Logger {
    public WarningLogger(int level) {
        this.level = level;
    }

    @Override
    protected void handleRequest(String msg) {
        System.out.println("WARNING LOGGER: " + msg);
    }
}
