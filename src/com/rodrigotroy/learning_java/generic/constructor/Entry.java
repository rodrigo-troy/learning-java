package com.rodrigotroy.learning_java.generic.constructor;

import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 * $ Project: learning_java_generics
 * User: rodrigotroy
 * Date: 2019-04-24
 * Time: 10:50
 */
public class Entry {
    private final String data;
    private final int rank;

    public Entry(String data,
                 int rank) {
        this.data = data;
        this.rank = rank;
    }

    public <E extends Rankable & Serializable> Entry(E element) {
        this.data = element.toString();
        this.rank = element.getRank();
    }

    public String getData() {
        return data;
    }

    public int getRank() {
        return rank;
    }
}
