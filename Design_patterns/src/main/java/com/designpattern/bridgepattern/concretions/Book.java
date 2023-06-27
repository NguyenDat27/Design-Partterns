package com.designpattern.bridgepattern.concretions;


import com.designpattern.bridgepattern.bridge.Product;
import com.designpattern.bridgepattern.ibookanddvd.Display;

public class Book extends Product {
    private String author;

    public Book(String name, double price, String author, Display display) {
        super(name, price, display);
        this.author = author;
    }

    @Override
    public String getDetails() {
        return author;
    }
}



