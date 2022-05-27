package com.rodrigotroy.learning_java.scanner;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * $ Project: learning-java
 * <p>User: rodrigotroy</p>
 * Date: 27-05-22
 * Time: 20:36
 *
 * <p>For a given string you should check whether it shows time in the correct format.
 * The string should consist of two integers separated by the colon.
 * The first integer should be from 00 to 23 and the second integer should be from 00 to 59.
 * <p>
 * Note that if only one digit in the integer, it should be padded with a leading zero. That is, strings "5:00" and "05:1" don't show time correctly, but "05:00" and "05:01" do.</p>
 */
public class RegexTime {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String time = scn.nextLine();

        String regex = "\\s*([01]\\d|2[0-3]):[0-5]\\d\\s*";

        System.out.println(time.matches(regex) ? "Yes" : "No");
    }
}
