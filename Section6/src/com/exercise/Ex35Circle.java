package com.exercise;

public class Ex35Circle {

    private double radius;

    public Ex35Circle(double radius) {
        if (radius <= 0) {
            this.radius = 0;
        } else {
            this.radius = radius;
        }
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return Math.pow(radius, 2) * Math.PI;
    }
}
