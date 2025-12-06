package com.upgrad.designpatterns.behavioral.chain.good;

public class ErrorLogger extends Logger {
    public ErrorLogger(int level) {
        this.level = level;
    }

    @Override
    protected void handleRequest(String msg) {
        System.out.println("ERROR LOGGER: " + msg);
    }
}
