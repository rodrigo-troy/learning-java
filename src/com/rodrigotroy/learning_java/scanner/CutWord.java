package com.rodrigotroy.learning_java.scanner;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * $ Project: learning-java
 * User: rodrigotroy
 * Date: 21-03-22
 * Time: 18:03
 */
public class CutWord {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String word = s.next();
        int num = s.nextInt();

        System.out.println(word.substring(num) + word.substring(0,
                                                                num));
    }
}
