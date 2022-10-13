package com.rodrigotroy.learning_java.lambda.map.example1;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * $ Project: learning_lambda
 * User: exrtroy
 * Date: 01-03-2021
 * Time: 15:21
 */
public class Person {
    private final List<Trip> trips = new ArrayList<>();
    private String name;

    public Person(String name) {
        super();
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addTrip(Trip v) {
        trips.add(v);
    }

    public List<Trip> getTrips() {
        return trips;
    }

    @Override
    public String toString() {
        return "Person{" +
               "trips=" + trips +
               ", name='" + name + '\'' +
               '}';
    }
}
