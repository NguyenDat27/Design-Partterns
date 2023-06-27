package com.designpattern.decoratorpattern.decorator;

import com.designpattern.decoratorpattern.istudent.Student;

public class HonorsStudent implements Student {
    private Student decoratedStudent;

    public HonorsStudent(Student decoratedStudent) {
        this.decoratedStudent = decoratedStudent;
    }

    @Override
    public int getId() {
        return decoratedStudent.getId();
    }

    @Override
    public String getName() {
        return decoratedStudent.getName() + " (Honors)";
    }

    @Override
    public int getAge() {
        return decoratedStudent.getAge();
    }
}