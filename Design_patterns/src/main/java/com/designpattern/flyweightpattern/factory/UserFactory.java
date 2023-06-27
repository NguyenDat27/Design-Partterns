package com.designpattern.flyweightpattern.factory;

import com.designpattern.flyweightpattern.model.User;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class UserFactory {
    private Map<String, User> userMap;

    public UserFactory() {
        this.userMap = new HashMap<>();
    }

    public User getUser(String username) {
        User user = userMap.get(username);
        if (user == null) {
            user = createUser(username);
            userMap.put(username, user);
        }
        return user;
    }

    private User createUser(String username) {
        // Simulate creating user based on username
        return new User(username, username + "@example.com");
    }
}

