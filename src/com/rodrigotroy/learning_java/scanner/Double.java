package com.rodrigotroy.learning_java.scanner;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * $ Project: learning-java
 * User: rodrigotroy
 * Date: 28-02-22
 * Time: 12:36
 */
public class Double {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();

        System.out.println(Math.pow(a,
                                    b));
    }
}
