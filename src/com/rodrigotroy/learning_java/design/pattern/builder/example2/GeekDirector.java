package com.rodrigotroy.learning_java.design.pattern.builder.example2;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * $ Project: learning-java
 * User: rodrigotroy
 * Date: 14-05-22
 * Time: 18:31
 */
public class GeekDirector {
    public void buildAdmin(Builder builder) {
        builder.setType("Admin");
        ArrayList<String> languages = new ArrayList<>();
        languages.add("Perl");
        languages.add("PHP");
        builder.setLanguages(languages);
        builder.setExperience(10);
    }

    public void buildBackend(Builder builder) {
        builder.setType("Backend");
        ArrayList<String> languages = new ArrayList<>();
        languages.add("Python");
        languages.add("PowerShell");
        builder.setLanguages(languages);
        builder.setExperience(5);
    }

    public void buildRockstar(Builder builder) {
        builder.setType("Rockstar");
        ArrayList<String> languages = new ArrayList<>();
        languages.add("Java");
        languages.add("Kotlin");
        languages.add("Scala");
        languages.add("Angular framework");
        builder.setLanguages(languages);
        builder.setExperience(20);
    }
}
