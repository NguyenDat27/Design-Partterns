package com.designpattern.decoratorpattern.controller;

import com.designpattern.decoratorpattern.decorator.HonorsStudent;
import com.designpattern.decoratorpattern.istudent.Student;
import com.designpattern.decoratorpattern.models.BasicStudent;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class StudentController {

    @GetMapping("/decorator")
    public String getStudents(Model model) {
        // Create a list of students (simulated data)
        List<Student> students = new ArrayList<>();
        students.add(new BasicStudent(1, "John Doe", 20));
        students.add(new HonorsStudent(new BasicStudent(2, "Jane Smith", 22)));
        students.add(new BasicStudent(3, "Mike Johnson", 19));

        // Pass the list of students to the model
        model.addAttribute("students", students);

        // Return the student template
        return "students";
    }
}
