package com.rodrigotroy.learning_java.sort;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * $ Project: learning-java
 * User: rodrigotroy
 * Date: 16-03-22
 * Time: 15:07
 */
public class SortArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        System.out.println(getResult(s));
    }

    private static boolean getResult(String s) {
        String[] s1 = s.split(" ");
        int[] ints = Arrays.stream(s1).mapToInt(Integer::parseInt).toArray();

        int n1 = ints[0];
        int n2 = ints[1];
        int n3 = ints[2];

        return (n1 <= n2 && n2 <= n3) || (n1 >= n2 && n2 >= n3);
    }
}
