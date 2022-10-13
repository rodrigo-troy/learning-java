package com.rodrigotroy.learning_java.lambda.map.example1;

/**
 * Created with IntelliJ IDEA.
 * $ Project: learning_lambda
 * User: exrtroy
 * Date: 01-03-2021
 * Time: 15:21
 */
public class Trip {
    private String country;

    public Trip(String country) {
        super();
        this.country = country;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Trip{" +
               "country='" + country + '\'' +
               '}';
    }
}
