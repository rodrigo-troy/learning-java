package com.rodrigotroy.learning_java.generic.example2;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * $ Project: learning-java
 * User: rodrigotroy
 * Date: 15-05-22
 * Time: 17:34
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name:");
        String customerName = scanner.next();

        System.out.println("Enter an amount of money:");
        while (!scanner.hasNextInt()) {
            scanner.next();
            System.out.println("Enter a valid amount of money:");
        }
        int money = scanner.nextInt();

        Customer customer = new Customer(customerName,
                                         money);

        TakeOutSimulator simulator = new TakeOutSimulator(customer,
                                                          scanner);

        simulator.startTakeOutSimulator();
    }
}
