package com.rodrigotroy.learning_java.regex;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * $ Project: learning-java
 * <p>User: rodrigotroy</p>
 * Date: 27-05-22
 * Time: 20:36
 *
 * <p><a href="https://hyperskill.org/learn/step/3674">source</a></p>
 * <p>The input date can be in any of the two formats: yyyy-mm-dd or dd-mm-yyyy.</p>
 * <p>The year must be 19yy or 20yy.</p>
 * <p>- /. symbols can be used as splitters.</p>
 * <p>dd from 01 to 31</p>
 * <p>mm from 01 to 12</p>
 */
public class RegexDate {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String date = scn.nextLine();

        String dateRegex1 = "\\s*(19|20)\\d{2}[-/.](0[1-9]|1[012])[-/.](0[1-9]|[12]\\d|30|31)\\s*";
        String dateRegex2 = "\\s*(0[1-9]|[12]\\d|30|31)[-/.](0[1-9]|1[012])[-/.](19|20)\\d{2}\\s*";

        System.out.println(date.matches(dateRegex1) || date.matches(dateRegex2) ? "Yes" : "No");
    }
}
