package com.exercise;

public class Ex34ComplexNumber {

    private double real;
    private double imaginary;

    public Ex34ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal() {
        return this.real;
    }

    public double getImaginary() {
        return this.imaginary;
    }

    public void add(double real, double imaginary) {
        this.real += real;
        this.imaginary += imaginary;
    }

    public void add(Ex34ComplexNumber ex34ComplexNumber) {
        add(ex34ComplexNumber.getReal(), ex34ComplexNumber.getImaginary());
    }

    public void subtract(double real, double imaginary) {
        this.real -= real;
        this.imaginary -= imaginary;
    }

    public void subtract(Ex34ComplexNumber ex34ComplexNumber) {
        subtract(ex34ComplexNumber.getReal(), ex34ComplexNumber.getImaginary());
    }
}

