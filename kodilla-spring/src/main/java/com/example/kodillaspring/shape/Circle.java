package com.example.kodillaspring.shape;

import org.springframework.stereotype.Component;

@Component
public class Circle implements Shape {
    @Override
    public String getName() {
        return "This is a Circle";
    }
}
