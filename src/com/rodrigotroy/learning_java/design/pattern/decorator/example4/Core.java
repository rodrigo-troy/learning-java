package com.rodrigotroy.learning_java.design.pattern.decorator.example4;

import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * User: rodrigotroy
 * Date: 6/6/12
 * Time: 4:45 PM
 * To change this template use File | Settings | File Templates.
 */
public class Core implements LCD {

    public void write(String[] s) {
        System.out.print("INPUT:    ");

        try {
            s[0] = in.readLine();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public void read(String[] s) {
        System.out.println("Output:   " + s[0]);
    }
}
