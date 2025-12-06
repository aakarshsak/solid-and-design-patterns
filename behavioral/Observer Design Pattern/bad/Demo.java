package com.upgrad.designpatterns.behavioral.observer.bad;



public class Demo {
    public static void main(String[] args) {
        NewsService newsService = new NewsService();

        ChannelAlpha channelAlpha = new ChannelAlpha();
        ChannelBeta channelBeta = new ChannelBeta();
        ChannelGamma channelGamma = new ChannelGamma();


        String msg = newsService.getNewsFlash();

        channelAlpha.update(msg);
        channelBeta.update(msg);
        channelGamma.update(msg);
    }
}
