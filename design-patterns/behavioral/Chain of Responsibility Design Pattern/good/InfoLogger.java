package com.upgrad.designpatterns.behavioral.chain.good;

public class InfoLogger extends Logger {
    public InfoLogger(int level) {
        this.level = level;
    }

    @Override
    protected void handleRequest(String msg) {
        System.out.println("INFO LOGGER: " + msg);
    }
}
