package com.example.design_patter.Mediator;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {
    private UserMediator userMediator;

    public UserController() {
        userMediator = new UserMediator();
        // Chèn dữ liệu mẫu
        userMediator.addUser(new User("1", "Alice"));
        userMediator.addUser(new User("2", "Bob"));
        userMediator.addUser(new User("3", "Charlie"));
    }

    @GetMapping("/")
    public List<User> getUsers() {
        return userMediator.getUsers();
    }

    @PostMapping("/{userId}/message")
    public void sendMessage(@PathVariable String userId, @RequestBody String message) {
        User sender = getUserById(userId);
        if (sender != null) {
            userMediator.sendMessage(sender, message);
        }
    }

    private User getUserById(String userId) {
        for (User user : userMediator.getUsers()) {
            if (user.getId().equals(userId)) {
                return user;
            }
        }
        return null;
    }
}