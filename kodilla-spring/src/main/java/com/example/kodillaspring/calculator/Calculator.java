package com.example.kodillaspring.calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Calculator {
    @Autowired
    Display display;

    public double add(double a, double b) {
        double val = a + b;
        display.displayValue(val);
        return val;
    }

    public double minus(double a, double b) {
        double val = a - b;
        display.displayValue(val);
        return val;
    }

    public double multiple(double a, double b) {
        double val = a * b;
        display.displayValue(val);
        return val;
    }

    public double devide(double a, double b) {
        double val = a / b;
        display.displayValue(val);
        return val;
    }


}
