package com.rodrigotroy.learning_java.regex;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * $ Project: learning-java
 * User: rodrigotroy
 * Date: 28-05-22
 * Time: 14:15
 */
public class RegexVar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfVariables = Integer.parseInt(scanner.nextLine());

        String regex = "(\\b[A-Za-z]\\w*|\\b_[A-Za-z\\d]+)";

        for (int i = 0; i < numberOfVariables; i++) {
            String identifier = scanner.nextLine();
            if (!identifier.matches(regex)) {
                System.out.printf("(%s) is invalid :(\n",
                                  identifier);
            } else {
                System.out.printf("(%s) is valid :)\n",
                                  identifier);
            }
        }
    }
}
