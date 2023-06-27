package com.designpattern.adapterpattern.impl;

import com.designpattern.adapterpattern.itemperature.TemperatureSensor;

public class FahrenheitSensor implements TemperatureSensor {
    @Override
    public double getTemperature() {
        // Giả sử giá trị nhiệt độ được lấy từ sensor là 75 độ Fahrenheit
        return 75;
    }
}
