package com.rodrigotroy.learning_java.design.pattern.decorator.example1;

/**
 * Created with IntelliJ IDEA.
 * $ Project: learning-java
 * User: rodrigotroy
 * Date: 30-03-22
 * Time: 12:35
 */
public class SeniorJavaDeveloper extends DeveloperDecorator {
    public SeniorJavaDeveloper(Developer developer) {
        super(developer);
    }

    public String makeCodeReview() {
        return "Make code review.";
    }

    public String makeJob() {
        return super.makeJob() + " " + makeCodeReview();
    }
}
