package com.rodrigotroy.learning_java.recursion;

/**
 * Created with IntelliJ IDEA.
 * $ Project: learning-java
 * User: rodrigotroy
 * Date: 24-02-22
 * Time: 17:57
 */
public class Example1 {
    public static long method(long a,
                              long b) {
        if (b == 0) {
            return b;
        }
        return a + method(a,
                          b - 1);
    }

    public static void main(String[] args) {
        System.out.println(method(10,
                                  3));
    }
}
