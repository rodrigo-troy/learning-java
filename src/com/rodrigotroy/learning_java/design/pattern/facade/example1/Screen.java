package com.rodrigotroy.learning_java.design.pattern.facade.example1;

public class Screen {

    String description;

    public Screen(String description) {
        this.description = description;
    }

    public void up() {
        System.out.println(description + " going up");
    }

    public void down() {
        System.out.println(description + " going down");
    }

    public String toString() {
        return description;
    }
}
