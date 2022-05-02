package com.rodrigotroy.learning_java.generic.example1;

/**
 * Created with IntelliJ IDEA.
 * $ Project: learning-java
 * User: rodrigotroy
 * Date: 02-05-22
 * Time: 19:29
 */
public class Container<T, S> {
    private final T item1;
    private final S item2;

    public Container(T item1,
                     S item2) {
        this.item1 = item1;
        this.item2 = item2;
    }

    public T getItem1() {
        return this.item1;
    }

    public S getItem2() {
        return this.item2;
    }
}
