package com.rodrigotroy.learning_java.generic.constructor;

import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 * $ Project: learning_java_generics
 * User: rodrigotroy
 * Date: 2019-04-24
 * Time: 10:56
 */
public class Product implements Rankable,
                                Serializable {
    private String name;
    private double price;
    private int sales;

    public Product(String name,
                   double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public int getRank() {
        return sales;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getSales() {
        return sales;
    }

    public void setSales(int sales) {
        this.sales = sales;
    }
}
