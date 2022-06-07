package com.rodrigotroy.learning_java.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created with IntelliJ IDEA.
 * $ Project: learning-java
 * User: rodrigotroy
 * Date: 07-06-22
 * Time: 16:03
 * <p>
 * The first line of the input contains a sequence of letters.
 * </p>
 * <p>
 * The second line of the input contains some text.
 * </p>
 * <p>
 * Your task is to determine whether any of the words from the second line contain this sequence of letters. Count only the words that do not start or end with your search term. If such a word is present in the line, output "YES", otherwise output "NO". The word can contain only the letters of the English alphabet. Ignore the case while searching for matches.
 * </p>
 */
public class PatternMatchExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String part = scanner.nextLine();
        String line = scanner.nextLine();

        Pattern pattern = Pattern.compile("\\B" + part + "\\B",
                                          Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(line);

        System.out.println(matcher.find() ? "YES" : "NO");
    }
}
