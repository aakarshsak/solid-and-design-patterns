package com.upgrad.designpatterns.behavioral.observer.good;


public class Demo {
    public static void main(String[] args) {
        NewsService newsService = new NewsService();

        newsService.attach(new ChannelAlpha());
        newsService.attach(new ChannelBeta());
        newsService.attach(new ChannelGamma());

        newsService.getNewsFlash();
    }
}
