package com.rodrigotroy.learning_java.design.pattern.builder.example2;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * $ Project: learning-java
 * User: rodrigotroy
 * Date: 14-05-22
 * Time: 18:28
 */
public class Geek {
    private final String type;
    private final List<String> languages;
    private final int experience;

    public Geek(String type,
                List<String> languages,
                int experience) {
        this.type = type;
        this.languages = languages;
        this.experience = experience;
    }

    public String getType() {
        return type;
    }

    public List<String> getLanguages() {
        return languages;
    }

    public int getExperience() {
        return experience;
    }

    @Override
    public String toString() {
        return "Type : " + type + "\n" +
               "Languages : " + languages + "\n" +
               "Experience : " + experience + " years";
    }
}
