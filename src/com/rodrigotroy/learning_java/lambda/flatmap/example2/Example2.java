package com.rodrigotroy.learning_java.lambda.flatmap.example2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * $ Project: learning_lambda
 * User: rodrigotroy
 * Date: 01-03-21
 * Time: 20:39
 */
public class Example2 {
    public static void main(String[] args) {
        List<List<Integer>> listaBidimensional = new ArrayList<>(Arrays.asList(new ArrayList<>(Arrays.asList(1,
                                                                                                             2)),
                                                                               new ArrayList<>(Arrays.asList(3,
                                                                                                             4))
        ));

        List<Integer> listaAplanada = listaBidimensional.stream()
                                                        .flatMap(Collection::stream).toList();


        listaAplanada.forEach(System.out::println);
    }
}
