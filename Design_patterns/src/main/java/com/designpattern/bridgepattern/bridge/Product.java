package com.designpattern.bridgepattern.bridge;

import com.designpattern.bridgepattern.ibookanddvd.Display;

public abstract class Product {
    protected String name;
    protected double price;
    protected Display display;

    public Product(String name, double price, Display display) {
        this.name = name;
        this.price = price;
        this.display = display;
    }

    public abstract String getDetails();

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void show() {
        display.showDetails(name, price, getDetails());
    }
}


