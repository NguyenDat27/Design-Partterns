package com.example.design_patter.Mediator;

import java.util.ArrayList;
import java.util.List;

public class UserMediator {
    private List<User> users;

    public UserMediator() {
        users = new ArrayList<>();
    }

    public void addUser(User user) {
        users.add(user);
    }

    public List<User> getUsers() {
        return users;
    }

    public void sendMessage(User sender, String message) {
        for (User user : users) {
            if (user != sender) {
                // Gửi tin nhắn đến tất cả người dùng khác trừ người gửi
                System.out.println("Message from " + sender.getName() + " to " + user.getName() + ": " + message);
            }
        }
    }
}