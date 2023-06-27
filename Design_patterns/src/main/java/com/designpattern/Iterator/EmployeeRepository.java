package com.example.design_patter.Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EmployeeRepository implements Iterable<Employee> {
    private List<Employee> employees;

    public EmployeeRepository() {
        employees = new ArrayList<>();
        // Chèn dữ liệu mẫu vào danh sách nhân viên
        employees.add(new Employee("1", "John Doe"));
        employees.add(new Employee("2", "Jane Smith"));
        employees.add(new Employee("3", "Mike Johnson"));
    }

    @Override
    public Iterator<Employee> iterator() {
        return employees.iterator();
    }
}