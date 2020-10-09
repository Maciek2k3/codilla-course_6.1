package com.kodilla.testing.shape;

import java.util.Objects;

public class Circle implements Shape{
    public static final String name="Circle";
    private double radious;

    public Circle(double radious) {
        this.radious = radious;
    }

    public static String getName() {
        return name;
    }

    public double getRadious() {
        return radious;
    }

    public void setRadious(double radious) {
        this.radious = radious;
    }

    @Override
    public String getShapeName() {
        return name;
    }

    @Override
    public double getField() {
        return Math.PI*(Math.pow(radious,2));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return Double.compare(circle.radious, radious) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(radious);
    }
}
