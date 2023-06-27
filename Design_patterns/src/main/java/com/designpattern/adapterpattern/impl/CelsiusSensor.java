package com.designpattern.adapterpattern.impl;

import com.designpattern.adapterpattern.itemperature.TemperatureSensor;

public class CelsiusSensor implements TemperatureSensor {
    @Override
    public double getTemperature() {
        // Giả sử giá trị nhiệt độ được lấy từ sensor là 23.89 độ Celsius
        return 23.89;
    }
}
