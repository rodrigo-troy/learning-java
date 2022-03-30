package com.rodrigotroy.learning_java.design.pattern.decorator.example1;

/**
 * Created with IntelliJ IDEA.
 * $ Project: learning-java
 * User: rodrigotroy
 * Date: 30-03-22
 * Time: 12:34
 */
public class JavaDeveloper implements Developer {
    @Override
    public String makeJob() {
        return "Write Java Code.";
    }
}
