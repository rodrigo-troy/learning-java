package com.rodrigotroy.learning_java.lambda.map.example2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * $ Project: learning_lambda
 * User: rodrigotroy
 * Date: 01-03-21
 * Time: 20:40
 */
public class Example2 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1,
                                                              2,
                                                              3,
                                                              4));

        List<Integer> squares = numbers.stream()
                                       .map(x -> x * x).toList();

        for (Integer n : squares) {
            System.out.println(n);
        }
    }
}
