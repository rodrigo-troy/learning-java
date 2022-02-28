package com.rodrigotroy.learning_java.lang;

import java.util.Random;

/**
 * Created with IntelliJ IDEA.
 * $ Project: learning-java
 * User: rodrigotroy
 * Date: 28-02-22
 * Time: 17:11
 */
public class Char {
    public static void main(String[] args) {
        Random r = new Random();

        for (int z = 0; z < 100; z++) {
            System.out.println((char) (r.nextInt(26) + 'a'));
        }

        for (int i = 97; i < 123; i++) {
            System.out.printf("char: %s\n",
                              Character.toString(i).charAt(0));
        }
    }
}
