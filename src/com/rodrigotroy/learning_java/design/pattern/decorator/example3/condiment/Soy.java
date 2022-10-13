package com.rodrigotroy.learning_java.design.pattern.decorator.example3.condiment;

import com.rodrigotroy.learning_java.design.pattern.decorator.example3.beverage.Beverage;

public class Soy extends CondimentDecorator {

    Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    public double cost() {
        return .15 + beverage.cost();
    }
}
