package com.rodrigotroy.learning_java.collection.map;

import java.util.Arrays;
import java.util.Collection;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * Created with IntelliJ IDEA.
 * $ Project: learning-java
 * User: rodrigotroy
 * Date: 14-10-22
 * Time: 18:05
 */
public class PowExample {
    public static Collection<Integer> pow2(Collection<Integer> numbers) {
        return numbers.stream().map(integer -> integer * integer).toList();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Collection<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                                            .map(Integer::parseInt)
                                            .collect(Collectors.toList());

        Collection<Integer> result = PowExample.pow2(numbers);

        System.out.println(result.stream()
                                 .map(Object::toString)
                                 .collect(Collectors.joining(" ")));
    }
}
