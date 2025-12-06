package com.upgrad.designpatterns.behavioral.mediator.good;


import java.util.HashMap;
import java.util.Map;

public class ChatRoomMediatorImpl implements ChatRoomMediator{
    private Map<String, User> users = new HashMap<>();
//    private List<User> users = new ArrayList<>();


    @Override
    public void joinUser(User user) {
        users.put(user.getName(), user);
        System.out.println(user.getName() + " Joined the Chat.");
        System.out.println("-----------------------");
        System.out.println(users.values().size() + " Participant(s)");
        System.out.println("-----------------------");
    }

    @Override
    public void send(String message, String userName) {
        User user = users.get(userName);
        if(user != null){
            user.receive(message);
        } else {
            System.out.println("-----------------------");
            System.out.println("User not found.");
            System.out.println("-----------------------");
        }
    }

    @Override
    public void send(String message) {
        for(User user: users.values()){
            user.receive(message);
        }
    }
}
