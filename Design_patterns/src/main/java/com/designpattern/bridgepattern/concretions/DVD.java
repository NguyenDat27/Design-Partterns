package com.designpattern.bridgepattern.concretions;


import com.designpattern.bridgepattern.bridge.Product;
import com.designpattern.bridgepattern.ibookanddvd.Display;

public class DVD extends Product {
    private int duration;

    public DVD(String name, double price, int duration, Display display) {
        super(name, price, display);
        this.duration = duration;
    }

    @Override
    public String getDetails() {
        return duration + " minutes";
    }
}



