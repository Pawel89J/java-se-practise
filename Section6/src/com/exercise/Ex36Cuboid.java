package com.exercise;

public class Ex36Cuboid extends Ex36Rectangle {

    private double height;

    public Ex36Cuboid(double width, double length, double height) {
        super(width, length);
        if (height < 0) {
            this.height = 0;
        } else {
            this.height = height;
        }
    }

    public double getHeight() {
        return height;
    }

    public double getVolume() {
        return getArea() * this.height;
    }
}
