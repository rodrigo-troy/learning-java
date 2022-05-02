package com.rodrigotroy.learning_java.generic.example1;

/**
 * Created with IntelliJ IDEA.
 * $ Project: learning-java
 * User: rodrigotroy
 * Date: 02-05-22
 * Time: 19:29
 */
public class Example1 {
    public static void main(String[] args) {
        Container<Integer, Double> myContainer = new Container<>(2,
                                                                 45.98);

        System.out.println("Item1: " + myContainer.getItem1());
        System.out.println("Item2: " + myContainer.getItem2());
    }
}
