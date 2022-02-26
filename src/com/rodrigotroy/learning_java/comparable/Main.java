package com.rodrigotroy.learning_java.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * $ Project: learning-java
 * User: rodrigotroy
 * Date: 26-02-22
 * Time: 17:20
 */
public class Main {
    public static void main(String[] args) {
        Coin big = new Coin(25,
                            2006);
        Coin medium1 = new Coin(10,
                                2016);
        Coin medium2 = new Coin(10,
                                2001);
        Coin small = new Coin(2,
                              2000);

        List<Coin> coins = new ArrayList<>();

        coins.add(big);
        coins.add(medium1);
        coins.add(medium2);
        coins.add(small);

        Collections.sort(coins);
        coins.forEach(System.out::println);
    }
}
