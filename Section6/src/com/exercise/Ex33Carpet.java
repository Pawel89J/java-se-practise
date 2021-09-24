package com.exercise;

public class Ex33Carpet {

    private double cost;

    public Ex33Carpet(double cost) {
        if (cost < 0) {
            this.cost = 0;
        } else {
            this.cost = cost;
        }
    }
    public double getCost() {
        return cost;
    }
}
