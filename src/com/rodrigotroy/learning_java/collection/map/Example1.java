package com.rodrigotroy.learning_java.collection.map;

import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * $ Project: learning-java
 * User: rodrigotroy
 * Date: 12-05-22
 * Time: 19:10
 * Source: https://www.codecademy.com/courses/learn-intermediate-java/lessons/collections-java/exercises/java-collections-map
 */
public class Example1 {
    public static void main(String[] args) {
        List<Integer> myInts = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 20; i++) {
            myInts.add(random.nextInt(5));
        }

        for (Integer i : myInts) {
            System.out.printf("%d ",
                              i);
        }
        System.out.println();
        System.out.println();

        Map<Integer, Integer> intCount = countNumbers(myInts);
        for (Map.Entry<Integer, Integer> entry : intCount.entrySet()) {
            System.out.println("Integer: " + entry.getKey() + " appears: " + entry.getValue());
        }
    }

    public static Map<Integer, Integer> countNumbers(List<Integer> list) {
        Map<Integer, Integer> intCount = new TreeMap<>();

        for (Integer i : list) {
            Integer currentCount = intCount.get(i);

            if (currentCount != null) {
                int newCount = currentCount + 1;
                intCount.put(i,
                             newCount);
            } else {
                intCount.put(i,
                             1);
            }
        }

        return intCount;
    }
}
