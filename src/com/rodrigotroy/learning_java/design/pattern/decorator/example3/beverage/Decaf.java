package com.rodrigotroy.learning_java.design.pattern.decorator.example3.beverage;

public class Decaf extends Beverage {

    public Decaf() {
        description = "Decaf Coffee";
    }

    public double cost() {
        return 1.05;
    }
}
