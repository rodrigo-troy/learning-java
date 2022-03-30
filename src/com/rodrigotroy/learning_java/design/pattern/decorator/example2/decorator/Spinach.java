package com.rodrigotroy.learning_java.design.pattern.decorator.example2.decorator;

import com.rodrigotroy.learning_java.design.pattern.decorator.example2.pizza.Pizza;

/**
 * Created with IntelliJ IDEA.
 * $ Project: learning-java
 * User: rodrigotroy
 * Date: 30-03-22
 * Time: 12:51
 */
public class Spinach extends Decorator {
    private final Pizza pizza;

    public Spinach(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", Spinach";
    }

    @Override
    public double cost() {
        return .09 + pizza.cost();
    }
}
