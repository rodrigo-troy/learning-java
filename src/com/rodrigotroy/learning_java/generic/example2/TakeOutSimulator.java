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
        Integer selection = null;

        while (selection == null) {
            System.out.println(userInputPrompt);

            if (input.hasNextInt()) {
                selection = input.nextInt();
            } else {
                System.out.println("Input needs to be an `int` type.");
                input.next();
            }
        }

        return intUserInputRetriever.produceOutputOnIntUserInput(selection);
    }

    public Boolean shouldSimulate() {
        String userPrompt = "Enter 1 to CONTINUE simulation or 0 to EXIT ";

        IntUserInputRetriever<Boolean> retriever = (int selection) -> {
            if (selection != 1 && selection != 0) {
                throw new IllegalArgumentException();
            }

            return selection == 1 && customer.getMoney() > 0;
        };

        return this.getOutputOnIntInput(userPrompt,
                                        retriever);
    }

    public Boolean isStillOrderingFood() {
        String userPrompt = "Enter 1 to CONTINUE shopping or 0 to CHECKOUT:";

        IntUserInputRetriever<Boolean> retriever = (int selection) -> {
            if (selection != 1 && selection != 0) {
                throw new IllegalArgumentException();
            }

            return selection == 1;
        };

        return this.getOutputOnIntInput(userPrompt,
                                        retriever);
    }

    public Food getMenuSelection() {
        return this.getOutputOnIntInput(menu.toString(),
                                        menu::getFood);
    }

    public void checkoutCustomer(ShoppingBag<Food> shoppingBag) {
        System.out.println("Processing payment...");

        customer.setMoney(customer.getMoney() - shoppingBag.getTotalPrice());

        System.out.printf("Your remaining money: $%d\n",
                          customer.getMoney());
        System.out.println("Thank you and enjoy your food!");
    }

    public void takeOutPrompt() {
        ShoppingBag<Food> shoppingBag = new ShoppingBag<>();

        int customerMoneyLeft = customer.getMoney();
        System.out.printf("You have $%d left to spend\n\n",
                          customerMoneyLeft);

        do {
            System.out.println("Today's Menu Options!");
            Food selection = this.getMenuSelection();

            customerMoneyLeft -= selection.getPrice();

            System.out.printf("You have $%d left to spend\n\n",
                              customerMoneyLeft);

            if (customerMoneyLeft >= 0) {
                shoppingBag.addItem(selection);
            }

            if (customerMoneyLeft <= 0) {
                break;
            }
        } while (isStillOrderingFood());

        this.checkoutCustomer(shoppingBag);
    }

    public void startTakeOutSimulator() {
        System.out.println("Hello, welcome to my restaurant!");
        System.out.printf("Welcome %s\n",
                          customer.getName());

        do {
            this.takeOutPrompt();
        } while (this.shouldSimulate());
    }
}
