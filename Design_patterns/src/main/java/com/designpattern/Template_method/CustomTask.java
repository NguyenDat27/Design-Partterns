package com.example.design_patter.Template_method;

public class CustomTask extends TaskTemplate {

    @Override
    protected void startTask() {
        System.out.println("Starting custom task...");
    }

    @Override
    protected String processTask() {
        // Logic để xử lý tác vụ
        return "Task Result";
    }
}