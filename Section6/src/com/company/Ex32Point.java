package com.company;

public class Ex32Point {

    private int x;
    private int y;

    public Ex32Point() {

    }

    public Ex32Point(int x, int y) {
        setX(x);
        setY(y);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    public double distance () {
        return distance(0,0);
    }
    public double distance(int x, int y) {
        return Math.sqrt(Math.pow(x - getX(),2) + Math.pow(y - getY(),2));
    }
    public double distance (Ex32Point otherEx32Point) {
        return distance(otherEx32Point.x, otherEx32Point.y);
    }
}
