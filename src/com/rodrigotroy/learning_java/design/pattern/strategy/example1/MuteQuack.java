package com.rodrigotroy.learning_java.design.pattern.strategy.example1;

public class MuteQuack implements QuackBehavior {

    public void quack() {
        System.out.println("<< Silence >>");
    }
}
