package com.rodrigotroy.learning_java.design.pattern.decorator.example4;

/**
 * Created with IntelliJ IDEA.
 * User: rodrigotroy
 * Date: 6/6/12
 * Time: 4:47 PM
 * To change this template use File | Settings | File Templates.
 */
public class Decorator implements LCD {
    private final LCD inner;

    public Decorator(LCD i) {
        inner = i;
    }

    public void write(String[] s) {
        inner.write(s);
    }

    public void read(String[] s) {
        inner.read(s);
    }
}
