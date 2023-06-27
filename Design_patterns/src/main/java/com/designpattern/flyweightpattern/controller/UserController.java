package com.designpattern.flyweightpattern.controller;

import com.designpattern.flyweightpattern.model.User;
import com.designpattern.flyweightpattern.factory.UserFactory;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class UserController {
    private UserFactory userFactory;

    public UserController(UserFactory userFactory) {
        this.userFactory = userFactory;
    }

    @GetMapping("/flyweight")
    public String users(Model model) {
        List<User> userList = new ArrayList<>();

        // Sử dụng UserFactory để tạo ra các đối tượng User
        User user1 = userFactory.getUser("john");
        userList.add(user1);

        User user2 = userFactory.getUser("alice");
        userList.add(user2);

        User user3 = userFactory.getUser("john");
        userList.add(user3);

        // Pass danh sách User vào model
        model.addAttribute("users", userList);

        return "users";
    }
}

