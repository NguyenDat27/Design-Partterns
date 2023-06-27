package com.designpattern.bridgepattern.impl;

import com.designpattern.bridgepattern.ibookanddvd.Display;

public class HtmlDisplay implements Display {
    @Override
    public void showDetails(String name, double price, String details) {
        System.out.println("<h2>Name: " + name + "</h2>");
        System.out.println("<p>Price: $" + price + "</p>");
        System.out.println("<p>Details: " + details + "</p>");
    }
}

