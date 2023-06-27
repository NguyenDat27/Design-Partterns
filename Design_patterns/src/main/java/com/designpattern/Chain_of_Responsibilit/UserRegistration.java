package com.example.design_patter.Chain_of_Responsibilit;

public class UserRegistration {
    private int age;
    private String email;
    private String username;

    // Constructors, getters, setters

    // Constructor
    public UserRegistration() {
    }

    // Getters and setters
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}