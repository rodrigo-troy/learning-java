package com.rodrigotroy.learning_java.lang;

/**
 * Created with IntelliJ IDEA.
 * $ Project: learning-java
 * User: rodrigotroy
 * Date: 20-02-22
 * Time: 14:42
 */
public class Overloading {
    public static void method(short s) {
        System.out.println("short");
    }

    public static void method(byte b) {
        System.out.println("byte");
    }

    public static void method(int i) {
        System.out.println("int");
    }

    public static void method(long l) {
        System.out.println("long");
    }

    public static void main(String[] args) {
        method(10);
    }
}
