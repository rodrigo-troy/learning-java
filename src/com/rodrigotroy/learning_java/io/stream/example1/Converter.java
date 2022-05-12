package com.rodrigotroy.learning_java.io.stream.example1;

import java.io.CharArrayWriter;
import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * $ Project: learning-java
 * User: rodrigotroy
 * Date: 12-05-22
 * Time: 18:01
 */
public class Converter {
    public static char[] convert(String[] words) throws
                                                 IOException {
        CharArrayWriter writer = new CharArrayWriter();

        for (String word : words) {
            writer.write(word);
        }

        return writer.toCharArray();
    }
}
