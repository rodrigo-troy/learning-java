package com.rodrigotroy.learning_java.generic.wildcard1;

/**
 * Created with IntelliJ IDEA.
 * $ Project: learning-java
 * User: rodrigotroy
 * Date: 02-05-22
 * Time: 20:17
 */
public class Bus<T> {
    private T rider;

    public Bus(T rider) {
        this.rider = rider;
    }

    public T getRider() {
        return this.rider;
    }

    public void setRider(T rider) {
        this.rider = rider;
    }

    public void printRider() {
        System.out.println(rider.toString());
    }
}
