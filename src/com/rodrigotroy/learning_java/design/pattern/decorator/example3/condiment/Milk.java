package com.rodrigotroy.learning_java.design.pattern.decorator.example3.condiment;

import com.rodrigotroy.learning_java.design.pattern.decorator.example3.beverage.Beverage;

public class Milk extends CondimentDecorator {

    Beverage beverage;

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Milk";
    }

    public double cost() {
        return .10 + beverage.cost();
    }
}
