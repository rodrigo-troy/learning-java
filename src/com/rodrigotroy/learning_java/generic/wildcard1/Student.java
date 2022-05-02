package com.rodrigotroy.learning_java.generic.wildcard1;

/**
 * Created with IntelliJ IDEA.
 * $ Project: learning-java
 * User: rodrigotroy
 * Date: 02-05-22
 * Time: 20:19
 */
public class Student extends SchoolPerson {
    private String bestSubject;

    public Student(String name,
                   String bestSubject) {
        super(name);
        this.bestSubject = bestSubject;
    }

    public String getBestSubject() {
        return this.bestSubject;
    }

    public void setSubject(String bestSubject) {
        this.bestSubject = bestSubject;
    }

    public String toString() {
        return "Student = (name = " + this.getName() + ", bestSubject = " + this.bestSubject + ")";
    }
}
