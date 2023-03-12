package com.kodilla.testing.shape;

public class Triangle implements Shape {
    private String name;
    private double base;
    private double height;

    public Triangle(String name, double base, double height) {
        this.name = name;
        this.base = base;
        this.height = height;
    }

    public String getShapeName() {
        return name;
    }

    public double getField() {
        return base * height / 2;
    }
}

