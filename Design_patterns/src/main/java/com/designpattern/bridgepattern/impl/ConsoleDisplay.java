package com.designpattern.bridgepattern.impl;

import com.designpattern.bridgepattern.ibookanddvd.Display;
public class ConsoleDisplay implements Display {
    @Override
    public void showDetails(String name, double price, String details) {
        System.out.println("Name: " + name);
        System.out.println("Price: $" + price);
        System.out.println("Details: " + details);
    }
}

