package com.upgrad.designpatterns.behavioral.chain.bad;

public abstract class Logger {
    private Levels level;

    public Logger(Levels level) {
        this.level = level;
    }

    public abstract void log(String msg);
}
