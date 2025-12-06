package com.upgrad.designpatterns.behavioral.mediator.good;

public interface ChatRoomMediator {
    public void joinUser(User user);
    public void send(String message, String userName);
    public void send(String message);
}
