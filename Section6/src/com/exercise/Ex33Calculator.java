package com.exercise;

public class Ex33Calculator {

    private Ex33Floor ex33Floor;
    private Ex33Carpet ex33Carpet;

    public Ex33Calculator(Ex33Floor ex33Floor, Ex33Carpet ex33Carpet) {
        this.ex33Floor = ex33Floor;
        this.ex33Carpet = ex33Carpet;
    }
    public double getTotalCost() {
        return (ex33Floor.getArea() * ex33Carpet.getCost());
    }
}
