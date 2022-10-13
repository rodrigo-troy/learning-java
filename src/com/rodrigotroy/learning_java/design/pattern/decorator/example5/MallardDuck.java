package com.rodrigotroy.learning_java.design.pattern.decorator.example5;

public class MallardDuck implements Quackable {

    public void quack() {
        System.out.println("Quack");
    }

    public String toString() {
        return "Mallard Duck";
    }
}
