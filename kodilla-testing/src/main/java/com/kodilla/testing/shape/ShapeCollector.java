package com.kodilla.testing.shape;

public class ShapeCollector {
    private Shape shape;
    private int shapeQuantity = 0;
    private Shape[] shapes = new Shape[0];

    public void addFigure(Shape shape) {
        this.shape = shape;
        shapeQuantity++;
        Shape[] tempArray = new Shape[shapeQuantity];
        System.arraycopy(shapes, 0, tempArray, 0, shapes.length);
        tempArray[shapeQuantity - 1] = shape;
        shapes = tempArray;
    }

    public void removeFigure(Shape shape) {
        this.shape = shape;
        shapeQuantity--;
        Shape[] tempArray = new Shape[shapeQuantity];
        int j = 0;
        for (int i = 0; i < shapes.length; i++) {
            if (shapes[i] != shape) {
                tempArray[j] = shapes[i];
                j++;
            }
        }
        shapes = tempArray;
    }

    public Shape getFigure(int n) {
        if (n >= 0 && n < shapes.length) {
            return shapes[n];
        } else {
            return null;
        }
    }

    public void showFigures() {
        for (int i = 0; i < shapes.length; i++) {
            System.out.println(shapes[i].getShapeName());
        }
    }

    public int getShapeQuantity() {
        return shapeQuantity;
    }

}
