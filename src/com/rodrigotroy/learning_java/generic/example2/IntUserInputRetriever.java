package com.rodrigotroy.learning_java.generic.example2;

/**
 * Created with IntelliJ IDEA.
 * $ Project: learning-java
 * User: rodrigotroy
 * Date: 15-05-22
 * Time: 19:03
 */
public interface IntUserInputRetriever<T> {
    T produceOutputOnIntUserInput(int selection);
}
