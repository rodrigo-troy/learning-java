package com.rodrigotroy.learning_java.design.pattern.decorator.example2.pizza;

/**
 * Created with IntelliJ IDEA.
 * $ Project: learning-java
 * User: rodrigotroy
 * Date: 30-03-22
 * Time: 12:44
 */
public class MeatHeaven extends Pizza {
    public MeatHeaven() {
        description = "MeatHeaven";
    }

    @Override
    public double cost() {
        return 4.0;
    }
}
