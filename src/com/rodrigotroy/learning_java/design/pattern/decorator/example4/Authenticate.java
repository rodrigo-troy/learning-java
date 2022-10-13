package com.rodrigotroy.learning_java.design.pattern.decorator.example4;

import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * User: rodrigotroy
 * Date: 6/6/12
 * Time: 4:47 PM
 * To change this template use File | Settings | File Templates.
 */
public class Authenticate extends Decorator {
    private String password;

    public Authenticate(LCD inner) {
        super(inner);
    }

    public void write(String[] s) {
        System.out.print("PASSWORD: ");

        try {
            password = in.readLine();
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        super.write(s);
    }

    public void read(String[] s) {
        System.out.print("PASSWORD: ");
        boolean isCorrect = false;

        try {
            String passConfirmation = in.readLine();

            isCorrect = passConfirmation.equals(password);
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        if (isCorrect) {
            super.read(s);
        } else {
            System.out.println("Password incorrecta!!");
        }
    }
}
