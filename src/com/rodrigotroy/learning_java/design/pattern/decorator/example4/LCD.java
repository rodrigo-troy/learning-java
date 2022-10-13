package com.rodrigotroy.learning_java.design.pattern.decorator.example4;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created with IntelliJ IDEA.
 * User: rodrigotroy
 * Date: 6/6/12
 * Time: 4:45 PM
 * To change this template use File | Settings | File Templates.
 */
public interface LCD {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

    void write(String[] s);

    void read(String[] s);
}
