package com.rodrigotroy.learning_java.scanner;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * $ Project: learning-java
 * User: rodrigotroy
 * Date: 23-02-22
 * Time: 21:01
 */
public class Scan {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (!scanner.hasNextInt()) {
            System.out.println("false");
            return;
        }

        int size = scanner.nextInt();
        scanner.nextLine();

        String line = scanner.nextLine();
        String[] array = line.split(" ");
        System.out.println(Arrays.toString(array));

        if (!scanner.hasNextInt()) {
            System.out.println("false");
            return;
        }

        int number = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < size; i++) {
            if (array[i].trim().equals(String.valueOf(number))) {
                System.out.println("true");
                return;
            }
        }

        System.out.println("false");
    }
}
