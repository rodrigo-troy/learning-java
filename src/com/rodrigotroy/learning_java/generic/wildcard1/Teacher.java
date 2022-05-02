package com.rodrigotroy.learning_java.generic.wildcard1;

/**
 * Created with IntelliJ IDEA.
 * $ Project: learning-java
 * User: rodrigotroy
 * Date: 02-05-22
 * Time: 20:19
 */
public class Teacher extends SchoolPerson {
    private String subject;

    public Teacher(String name,
                   String subject) {
        super(name);
        this.subject = subject;
    }

    public String getSubject() {
        return this.subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String toString() {
        return "Teacher = (name = " + this.getName() + ", subject = " + this.subject + ")";
    }
}
