package com.rodrigotroy.learning_java.algorithm;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * $ Project: learning-java
 * User: rodrigotroy
 * Date: 02-03-22
 * Time: 11:58
 */
public class MaximumProduct {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("size: ");
        int size = s.nextInt();
        s.nextLine();

        System.out.print("array: ");
        String arr = s.nextLine();

        String[] split = arr.split("\\s+");
        System.out.println(Arrays.toString(split));

        int max1 = Arrays.stream(split).mapToInt(Integer::parseInt).max().orElseThrow();
        long count = Arrays.stream(split).mapToInt(Integer::parseInt)
                           .filter(integer -> integer == max1)
                           .count();

        if (count > 1) {
            System.out.println(max1 * max1);
        } else {
            int max2 = Arrays.stream(split).mapToInt(Integer::parseInt)
                             .filter(integer -> integer != max1)
                             .max().orElse(max1);

            System.out.println(max1 * max2);
        }
    }

    public static void selectionSort(int[] arr) {
        int size = arr.length;
        for (int i = 0; i < size - 1; i++) {
            int currentMinimumIndex = i;
            for (int j = i + 1; j < size; j++) {
                if (arr[j] < arr[currentMinimumIndex]) {
                    currentMinimumIndex = j;
                }
            }
            swap(arr,
                 i,
                 currentMinimumIndex);
        }
    }

    public static void swap(int[] arr,
                            int indexOne,
                            int indexTwo) {
        int temp = arr[indexTwo];
        arr[indexTwo] = arr[indexOne];
        arr[indexOne] = temp;
    }
}
