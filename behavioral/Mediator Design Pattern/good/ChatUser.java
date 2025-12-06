package com.upgrad.designpatterns.behavioral.mediator.good;

import java.util.Date;

public class ChatUser extends User {

    public ChatUser(String name, ChatRoomMediator chatRoomMediator) {
        super(name, chatRoomMediator);
    }

    @Override
    public void send(String message, String userId) {
        System.out.println(this.getName() + getTimestamp() + message);
        getChatRoomMediator().send(message, userId);
    }

    @Override
    public void send(String message) {
        System.out.println(this.getName()+ getTimestamp() + message);
        getChatRoomMediator().send(message);
    }

    @Override
    public void receive(String message) {
        System.out.println(this.getName() + " RECEIVED" + getTimestamp() + message);
    }

    private String getTimestamp(){
        Date date = new Date();
        return " (" + date.getHours() + ":" + date.getMinutes() + ":" + date.getSeconds() + "):";
    }
}
