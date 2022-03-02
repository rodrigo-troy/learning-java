package com.rodrigotroy.learning_java.sort;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * $ Project: learning-java
 * User: rodrigotroy
 * Date: 19-02-22
 * Time: 22:14
 */
public class InsertionSort {
    public static void sort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int current = array[i];
            int j = i - 1;

            while (j >= 0 && array[j] > current) {
                array[j + 1] = array[j];
                j--;
            }

            array[j + 1] = current;
        }
    }

    public static void main(String[] args) {
        int[] numbers = {7, 2, 1000, 14, -7, 72, 0};
        System.out.println(Arrays.toString(numbers));
        System.out.println("Array in ascending order");
        sort(numbers);
        System.out.println(Arrays.toString(numbers));
    }
}
