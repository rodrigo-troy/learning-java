package com.rodrigotroy.learning_java.design.pattern.decorator.example5;

public class DuckCall implements Quackable {

    public void quack() {
        System.out.println("Kwak");
    }

    public String toString() {
        return "Duck Call";
    }
}
