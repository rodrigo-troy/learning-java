package com.rodrigotroy.learning_java.design.pattern.decorator.example3.beverage;

public abstract class Beverage {

    String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
