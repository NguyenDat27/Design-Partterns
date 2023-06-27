package com.example.design_patter.Command;

// Đối tượng Đèn
public class Light {
    private boolean isOn;

    public void turnOn() {
        isOn = true;
        System.out.println("Đèn đã được bật");
    }

    public void turnOff() {
        isOn = false;
        System.out.println("Đèn đã được tắt");
    }
}