package com.example.design_patter.Template_method;

public abstract class TaskTemplate {

    public void executeTask() {
        startTask();
        String result = processTask();
        endTask(result);
    }

    protected abstract void startTask();

    protected abstract String processTask();

    protected void endTask(String result) {
        System.out.println("Task completed successfully. Result: " + result);
    }
}