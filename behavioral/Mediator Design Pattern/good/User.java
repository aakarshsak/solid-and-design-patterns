package com.upgrad.designpatterns.behavioral.mediator.good;

import java.util.UUID;

public abstract class User {
    private String uuid;
    private String name;
    private ChatRoomMediator chatRoomMediator;

    //    User needs to know where to access the chatroom.
    //    You cannot use the chat room without the URL of the chatroom, can you?

    public User(String name, ChatRoomMediator chatRoomMediator) {
        this.uuid = UUID.randomUUID().toString();
        this.name = name;
        this.chatRoomMediator = chatRoomMediator;
    }

    public String getUuid() {
        return uuid;
    }

    public String getName() {
        return name;
    }

    public ChatRoomMediator getChatRoomMediator() {
        return chatRoomMediator;
    }

    public abstract void send(String msg, String userId);
    public abstract void send(String msg);
    public abstract void receive(String msg);

}
