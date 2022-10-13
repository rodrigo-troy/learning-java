package com.rodrigotroy.learning_java.lambda.flatmap.example1;

import com.rodrigotroy.learning_java.lambda.map.example1.Person;
import com.rodrigotroy.learning_java.lambda.map.example1.Trip;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Consumer;

/**
 * Created with IntelliJ IDEA.
 * $ Project: learning_lambda
 * User: exrtroy
 * Date: 01-03-2021
 * Time: 15:22
 * https://www.arquitecturajava.com/java-8-flatmap/
 */
public class Example1 {
    public static void main(String[] args) {
        Person p = new Person("pedro");
        Trip v = new Trip("Francia");
        Trip v2 = new Trip("Inglaterra");
        p.addTrip(v);
        p.addTrip(v2);

        Person p1 = new Person("gema");
        Trip v3 = new Trip("Italia");
        Trip v4 = new Trip("Belgica");
        p1.addTrip(v3);
        p1.addTrip(v4);

        List<Person> personas = new ArrayList<>();
        personas.add(p);
        personas.add(p1);

        for (Person persona : personas) {
            for (Trip viaje : persona.getTrips()) {
                System.out.println(viaje.getCountry());
            }
        }

        personas.stream().map(Person::getTrips).flatMap(Collection::stream).forEach(new Consumer<Trip>() {
            @Override
            public void accept(Trip t) {
                System.out.println(t.getCountry());
            }
        });

        personas.stream().map(Person::getTrips).flatMap(Collection::stream).forEach(new Consumer<Trip>() {
            @Override
            public void accept(Trip t) {
                System.out.println(t.getCountry());
            }
        });

        personas.stream().map(Person::getTrips).flatMap(Collection::stream).forEach(t -> System.out.println(t.getCountry()));

        personas.stream().map(Person::getTrips).flatMap(Collection::stream).map(Trip::getCountry).forEach(System.out::println);

    }
}
