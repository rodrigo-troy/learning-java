package com.rodrigotroy.learning_java.design.pattern.decorator.example2.pizza;

/**
 * Created with IntelliJ IDEA.
 * $ Project: learning-java
 * User: rodrigotroy
 * Date: 30-03-22
 * Time: 12:43
 */
public abstract class Pizza {
    protected String description;

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
