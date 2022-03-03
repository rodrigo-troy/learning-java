package com.rodrigotroy.learning_java.exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * Created with IntelliJ IDEA.
 * $ Project: learning-java
 * User: rodrigotroy
 * Date: 03-03-22
 * Time: 17:48
 */
public class Checked {
    public static void method() throws
                                FileNotFoundException {
        File file = new File("not_exist.txt");
        FileInputStream stream = new FileInputStream(file);
    }

    /* Do not change code below */
    public static void main(String[] args) {
        try {
            method();
        } catch (RuntimeException e) {
            System.out.println("RuntimeException");
        } catch (Exception e) {
            System.out.println("Exception");
        }
    }
}
