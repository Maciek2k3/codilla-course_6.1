package com.kodilla.testing.shape;

import java.util.Objects;

public class Triangle implements Shape {
    public static final String name="Triangle";
    private double a,h;

    public Triangle(double a, double h) {
        this.a = a;
        this.h = h;
    }

    public static String getName() {
        return name;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }

    @Override
    public String getShapeName() {
        return name;
    }

    @Override
    public double getField() {
        return 0.5*a*h;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triangle triangle = (Triangle) o;
        return Double.compare(triangle.a, a) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(a);
    }
}
