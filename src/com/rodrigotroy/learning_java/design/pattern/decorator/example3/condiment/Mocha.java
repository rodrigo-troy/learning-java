package com.rodrigotroy.learning_java.design.pattern.decorator.example3.condiment;

import com.rodrigotroy.learning_java.design.pattern.decorator.example3.beverage.Beverage;

public class Mocha extends CondimentDecorator {

    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    public double cost() {
        return .20 + beverage.cost();
    }
}
