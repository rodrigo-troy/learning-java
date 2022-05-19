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
    private final Customer customer;
    private final FoodMenu menu;
    private final Scanner input;

    public TakeOutSimulator(Customer customer,
                            Scanner input) {
        this.customer = customer;
        this.menu = new FoodMenu();
        this.input = input;
    }

    private <T> T getOutputOnIntInput(String userInputPrompt,
                                      IntUserInputRetriever<T> intUserInputRetriever) {
        while (input.hasNext()) {
            System.out.println(userInputPrompt);

            if (input.hasNextInt()) {
                int selection = 0;

                try {
                    selection = input.nextInt();
                    return intUserInputRetriever.produceOutputOnIntUserInput(selection);
                } catch (Exception e) {
                    System.out.printf("%d is not a valid input. Try Again!",
                                      selection);
                }
            } else {
                System.out.println("Input needs to be an `int` type.");
            }
        }

        return null;
    }

    public boolean shouldSimulate() {
        return false;
    }
}
