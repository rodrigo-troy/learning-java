package com.rodrigotroy.learning_java.design.pattern.decorator.example2.decorator;

import com.rodrigotroy.learning_java.design.pattern.decorator.example2.pizza.Pizza;

/**
 * Created with IntelliJ IDEA.
 * $ Project: learning-java
 * User: rodrigotroy
 * Date: 30-03-22
 * Time: 12:50
 */
public class Cheese extends Decorator {
    private final Pizza pizza;

    public Cheese(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", Cheese";
    }

    @Override
    public double cost() {
        return .20 + pizza.cost();
    }
}
