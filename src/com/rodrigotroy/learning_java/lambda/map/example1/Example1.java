package com.rodrigotroy.learning_java.lambda.map.example1;

import java.util.ArrayList;
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

        personas.stream().map(Person::getTrips).forEach(new Consumer<List<Trip>>() {
            @Override
            public void accept(List<Trip> s) {
                s.forEach(viaje -> System.out.println(viaje.getCountry()));
            }
        });

        personas.stream().map(Person::getTrips).forEach(new Consumer<List<Trip>>() {
            @Override
            public void accept(List<Trip> s) {
                s.forEach(viaje -> System.out.println(viaje.getCountry()));
            }
        });

        personas.stream().map(Person::getTrips).forEach(s -> s.forEach(viaje -> System.out.println(viaje.getCountry())));
    }
}
