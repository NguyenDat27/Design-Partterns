package com.example.design_patter.Mediator;

public class User {
    private String id;
    private String name;
    // Các thuộc tính khác và phương thức getter, setter

    public User(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Object getId() {
        return  id;
    }
}
