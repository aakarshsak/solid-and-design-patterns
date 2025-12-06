package com.upgrad.designpatterns.behavioral.chain.good;

public class ChainDemo {
    public static void main(String[] args) {
        LoggingService loggingService = new LoggingService();

        loggingService.log(Logger.INFO, "This is an info message");
        System.out.println("===================================");
        loggingService.log(Logger.WARNING, "This is a warning message");
        System.out.println("===================================");
        loggingService.log(Logger.ERROR, "This is an error message");

    }
}
