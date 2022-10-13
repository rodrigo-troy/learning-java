package com.rodrigotroy.learning_java.design.pattern.builder.example2;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * $ Project: learning-java
 * User: rodrigotroy
 * Date: 14-05-22
 * Time: 18:29
 */
public class GeekDirector implements Builder {
    private String type;
    private List<String> languages;
    private int experience;

    @Override
    public void setType(String type) {
        this.type = type;
    }

    @Override
    public void setLanguages(List<String> languages) {
        this.languages = languages;
    }

    @Override
    public void setExperience(int experience) {
        this.experience = experience;
    }

    public Geek getResult() {
        return new Geek(this.type,
                        this.languages,
                        this.experience);
    }

    public void buildRockstar(GeekBuilder builder) {

    }

    public void buildBackend(GeekBuilder builder) {

    }

    public void buildAdmin(GeekBuilder builder) {

    }
}
