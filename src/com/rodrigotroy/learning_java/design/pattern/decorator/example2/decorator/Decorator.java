package com.rodrigotroy.learning_java.design.pattern.decorator.example2.decorator;

import com.rodrigotroy.learning_java.design.pattern.decorator.example2.pizza.Pizza;

/**
 * Created with IntelliJ IDEA.
 * $ Project: learning-java
 * User: rodrigotroy
 * Date: 30-03-22
 * Time: 12:48
 */
public abstract class Decorator extends Pizza {
    public abstract String getDescription();
}
