package com.rodrigotroy.learning_java.serialization.example1;

/**
 * Created with IntelliJ IDEA.
 * $ Project: learning-java
 * User: rodrigotroy
 * Date: 22-04-22
 * Time: 17:44
 */
public class Engine {
    private double liters;
    private int cylinders;

    public Engine(double liters,
                  int cylinders) {
        this.liters = liters;
        this.cylinders = cylinders;
    }

    public int getCylinders() {
        return cylinders;
    }

    public double getLiters() {
        return this.liters;
    }

    public String toString() {
        return String.format("Engine liters is: %f, Engine cylinders is: %d",
                             this.liters,
                             this.cylinders);
    }
}
