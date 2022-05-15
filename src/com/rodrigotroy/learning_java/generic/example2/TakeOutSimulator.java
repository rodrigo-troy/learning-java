package com.rodrigotroy.learning_java.generic.example2;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * $ Project: learning-java
 * User: rodrigotroy
 * Date: 15-05-22
 * Time: 19:05
 */
public class TakeOutSimulator {
    private Customer customer;
    private FoodMenu menu;
    private Scanner input;

    public TakeOutSimulator(Customer customer,
                            FoodMenu menu,
                            Scanner input) {
        this.customer = customer;
        this.menu = menu;
        this.input = input;
    }

    private <T> T getOutputOnIntInput(String userInputPrompt,
                                      IntUserInputRetriever intUserInputRetriever) {
        return null;
    }
}
