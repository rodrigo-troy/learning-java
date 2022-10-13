package com.rodrigotroy.learning_java.design.pattern.decorator.example5;

public class RubberDuck implements Quackable {

    public void quack() {
        System.out.println("Squeak");
    }

    public String toString() {
        return "Rubber Duck";
    }
}
