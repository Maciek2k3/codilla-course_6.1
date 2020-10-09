package com.kodilla.testing.shape;

import java.util.LinkedList;
import java.util.List;

public class ShapeCollector {

    List<Shape> shapes=new LinkedList<>();

    public void addFigures(Shape shape){
        shapes.add(shape);
    }
    public void removeFogure(Shape shape){
        shapes.remove(shape);
    }
    public Shape getFigure(int n) {
        if (shapes.size() > 0 && shapes.size() < n) {
            return shapes.get(n);
        } else {
            return null;
        }
    }
    public String showFigures(){
        return shapes.toString();
    }
}
