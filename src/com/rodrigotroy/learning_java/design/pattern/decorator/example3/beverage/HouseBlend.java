package com.rodrigotroy.learning_java.design.pattern.decorator.example3.beverage;

public class HouseBlend extends Beverage {

    public HouseBlend() {
        description = "House Blend Coffee";
    }

    public double cost() {
        return .89;
    }
}
