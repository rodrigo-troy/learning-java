package com.rodrigotroy.learning_java.design.pattern.decorator.example3.beverage;

public class DarkRoast extends Beverage {

    public DarkRoast() {
        description = "Dark Roast Coffee";
    }

    public double cost() {
        return .99;
    }
}
