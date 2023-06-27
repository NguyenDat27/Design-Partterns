package com.designpattern.compositepattern.controller;

import com.designpattern.compositepattern.composite.Department;
import com.designpattern.compositepattern.leaf.Employee;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class EmployeeController {

    @GetMapping("/composite")
    public String index(Model model) {
        // Tạo cấu trúc Composite
        Department engineering = new Department("Engineering");
        engineering.addEmployee(new Employee("John Doe", "Software Engineer"));
        engineering.addEmployee(new Employee("Jane Smith", "QA Engineer"));

        Department sales = new Department("Sales");
        sales.addEmployee(new Employee("Mike Johnson", "Sales Representative"));
        sales.addEmployee(new Employee("Lisa Brown", "Sales Manager"));

        List<Department> departments = new ArrayList<>();
        departments.add(engineering);
        departments.add(sales);

        // Hiển thị dữ liệu bằng Thymeleaf
        model.addAttribute("departments", departments);

        return "employee";
    }
}



