package com.upgrad.designpatterns.behavioral.chain.bad;

public class LoggerDemo {
    public static void main(String[] args) {
        LoggingService loggingService = new LoggingService();

        loggingService.log(Levels.INFO, "This is an info message");
        loggingService.log(Levels.WARNING, "This is a warning message");
    }
}
