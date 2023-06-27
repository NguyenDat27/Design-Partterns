package com.designpattern.adapterpattern.controller;

import com.designpattern.adapterpattern.adapter.CelsiusToFahrenheitAdapter;
import com.designpattern.adapterpattern.adapter.FahrenheitToCelsiusAdapter;
import com.designpattern.adapterpattern.impl.CelsiusSensor;
import com.designpattern.adapterpattern.impl.FahrenheitSensor;
import com.designpattern.adapterpattern.form.TemperatureForm;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class TemperatureController {
    @GetMapping("/adapter")
    public String showTemperatureForm(Model model) {
        model.addAttribute("temperatureForm", new TemperatureForm());
        return "temperature";
    }

    @PostMapping("/adapter/convert")
    public String convertTemperature(TemperatureForm temperatureForm, Model model) {
        double temperature = temperatureForm.getTemperature();
        String scale = temperatureForm.getScale();

        if (scale.equals("celsius")) {
            FahrenheitSensor fahrenheitSensor = new FahrenheitSensor();
            FahrenheitToCelsiusAdapter adapter = new FahrenheitToCelsiusAdapter(fahrenheitSensor);
            double result = adapter.getTemperature(temperature);
            model.addAttribute("result", result);
            model.addAttribute("fromScale", "Fahrenheit");
            model.addAttribute("toScale", "Celsius");
        } else if (scale.equals("fahrenheit")) {
            CelsiusSensor celsiusSensor = new CelsiusSensor();
            CelsiusToFahrenheitAdapter adapter = new CelsiusToFahrenheitAdapter(celsiusSensor);
            double result = adapter.getTemperature(temperature);
            model.addAttribute("result", result);
            model.addAttribute("fromScale", "Celsius");
            model.addAttribute("toScale", "Fahrenheit");
        }

        return "result";
    }
}


