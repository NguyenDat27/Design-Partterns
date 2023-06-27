package com.designpattern.adapterpattern.adapter;

import com.designpattern.adapterpattern.itemperature.TemperatureAdapter;
import com.designpattern.adapterpattern.impl.FahrenheitSensor;

public class FahrenheitToCelsiusAdapter implements TemperatureAdapter {
    private FahrenheitSensor fahrenheitSensor;

    public FahrenheitToCelsiusAdapter(FahrenheitSensor fahrenheitSensor) {
        this.fahrenheitSensor = fahrenheitSensor;
    }

    @Override
    public double getTemperature(double temperature) {
        // Chuyển đổi từ Fahrenheit sang Celsius
        return (temperature - 32) * 5 / 9;
    }
}
