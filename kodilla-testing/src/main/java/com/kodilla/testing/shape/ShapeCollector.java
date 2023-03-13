package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {
    private Shape shape;
    private int shapeQuantity = 0;
    private ArrayList<Shape> shapes = new ArrayList<>();

    public void addFigure(Shape shape) {
        this.shape = shape;
        shapes.add(shape);
        shapeQuantity++;
    }

    public void removeFigure(Shape shape) {
        this.shape = shape;
        shapes.remove(shape);
        shapeQuantity--;
    }

    public Shape getFigure(int n) {
        return shapes.get(n);
    }

    public int getShapeQuantity() {
        return shapeQuantity;
    }

    public Shape showFigures() {
        return shape;
    }

}
