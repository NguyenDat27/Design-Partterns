package com.example.design_patter.Template_method;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TaskController {

    @PostMapping("/task")
    public ResponseEntity<String> executeTask() {
        TaskTemplate task = new CustomTask();
        task.executeTask();
        return ResponseEntity.ok("Task executed successfully");
    }
}