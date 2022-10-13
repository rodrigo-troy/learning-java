package com.rodrigotroy.learning_java.design.pattern.decorator.example3.condiment;

import com.rodrigotroy.learning_java.design.pattern.decorator.example3.beverage.Beverage;

public abstract class CondimentDecorator extends Beverage {

    public abstract String getDescription();
}
