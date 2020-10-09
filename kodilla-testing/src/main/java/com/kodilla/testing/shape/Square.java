package com.kodilla.testing.shape;

import java.util.Objects;

public class Square implements Shape {
    public static final String name = "Square";
    private double b;

    public Square(double b) {
        this.b = b;
    }

    public static String getName() {
        return name;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Square square = (Square) o;
        return Double.compare(square.b, b) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(b);
    }

    @Override
    public String getShapeName() {
        return name;
    }

    @Override
    public double getField() {
        return Math.pow(b, 2);
    }
}
