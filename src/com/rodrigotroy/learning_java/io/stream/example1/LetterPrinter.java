package com.rodrigotroy.learning_java.io.stream.example1;

import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * $ Project: learning-java
 * User: rodrigotroy
 * Date: 12-05-22
 * Time: 18:02
 */
public class LetterPrinter {
    public void write(char letter) {
        //implementation
    }

    public void writeWords(String[] words) throws
                                           IOException {
        LetterPrinter printer = new LetterPrinter();

        char[] letters = Converter.convert(words); // converting method
        for (char letter : letters) {
            printer.write(letter);
        }
    }
}
