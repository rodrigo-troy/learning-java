package com.rodrigotroy.learning_java.generic.wildcard1;

/**
 * Created with IntelliJ IDEA.
 * $ Project: learning-java
 * User: rodrigotroy
 * Date: 02-05-22
 * Time: 20:18
 */
public class SchoolPerson {
    private String name;

    public SchoolPerson(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "SchoolPerson (name = " + this.name + ")";
    }
}
