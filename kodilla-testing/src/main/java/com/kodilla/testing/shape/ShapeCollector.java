package com.kodilla.testing.shape;

import java.util.LinkedList;
import java.util.List;

public class ShapeCollector {

    private List<Shape> shapes = new LinkedList<>();

    public List<Shape> getShapes() {
        return shapes;
    }

    public void addFigures(Shape shape) {
        shapes.add(shape);
    }

    public void removeFogure(Shape shape) {
        shapes.remove(shape);
    }

    public Shape getFigure(int n) {
        if (n<shapes.size() && n>=0) {
            return shapes.get(n);
        } else {
            return null;
        }
    }

    public String showFigures() {
        return shapes.toString();
    }
}
