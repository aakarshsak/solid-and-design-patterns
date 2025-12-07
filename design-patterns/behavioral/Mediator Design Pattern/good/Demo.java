package com.upgrad.designpatterns.behavioral.mediator.good;

public class Demo {
    public static void main(String[] args) {
        ChatRoomMediator chatRoomMediator = new ChatRoomMediatorImpl();

        User adam = new ChatUser("Adam", chatRoomMediator);
        User rob = new ChatUser("Rob", chatRoomMediator);
        User jill = new ChatUser("Jill", chatRoomMediator);

        chatRoomMediator.joinUser(adam);
        chatRoomMediator.joinUser(rob);
        chatRoomMediator.joinUser(jill);

        // 1 on 1 (Personal Message)
        adam.send("Hi Rob", "Rob");

        System.out.println("\n\n");

        // GROUP MESSAGE
        jill.send("Happy Holidays!!!!");
    }
}
