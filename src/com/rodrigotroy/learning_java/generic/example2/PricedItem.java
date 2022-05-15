package com.rodrigotroy.learning_java.generic.example2;

/**
 * Created with IntelliJ IDEA.
 * $ Project: learning-java
 * User: rodrigotroy
 * Date: 15-05-22
 * Time: 17:34
 */
public interface PricedItem<T extends Number> {
    T getPrice();

    void setPrice(T price);
}
