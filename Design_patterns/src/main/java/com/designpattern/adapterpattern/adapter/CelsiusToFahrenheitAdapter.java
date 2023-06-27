package com.designpattern.adapterpattern.adapter;

import com.designpattern.adapterpattern.impl.CelsiusSensor;
import com.designpattern.adapterpattern.itemperature.TemperatureAdapter;

public class CelsiusToFahrenheitAdapter implements TemperatureAdapter {
    private CelsiusSensor celsiusSensor;

    public CelsiusToFahrenheitAdapter(CelsiusSensor celsiusSensor) {
        this.celsiusSensor = celsiusSensor;
    }

    @Override
    public double getTemperature(double temperature) {
        // Chuyển đổi từ Celsius sang Fahrenheit
        return (temperature * 9 / 5) + 32;
    }
}
