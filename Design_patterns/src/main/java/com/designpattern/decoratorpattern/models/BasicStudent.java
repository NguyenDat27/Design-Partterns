package com.designpattern.decoratorpattern.models;

import com.designpattern.decoratorpattern.istudent.Student;

public class BasicStudent implements Student {
    private int id;
    private String name;
    private int age;

    public BasicStudent(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getAge() {
        return age;
    }
}