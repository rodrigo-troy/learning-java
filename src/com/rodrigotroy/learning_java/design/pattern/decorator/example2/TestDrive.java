package com.rodrigotroy.learning_java.design.pattern.decorator.example2;

import com.rodrigotroy.learning_java.design.pattern.decorator.example2.decorator.*;
import com.rodrigotroy.learning_java.design.pattern.decorator.example2.pizza.MeatHeaven;
import com.rodrigotroy.learning_java.design.pattern.decorator.example2.pizza.Pizza;
import com.rodrigotroy.learning_java.design.pattern.decorator.example2.pizza.Vegan;

import java.util.Locale;

/**
 * Created with IntelliJ IDEA.
 * $ Project: learning-java
 * User: rodrigotroy
 * Date: 30-03-22
 * Time: 12:43
 */
public class TestDrive {
    public static void main(String[] args) {
        Pizza simpleVeganPizza = new Vegan();
        System.out.println(simpleVeganPizza.getDescription() + ". $" + formatSum(simpleVeganPizza.cost()));

        Pizza veganPizzaDecor = new Vegan();
        veganPizzaDecor = new Broccoli(veganPizzaDecor);
        veganPizzaDecor = new Tomato(veganPizzaDecor);
        veganPizzaDecor = new Spinach(veganPizzaDecor);
        System.out.println(veganPizzaDecor.getDescription() + ". $" + formatSum(veganPizzaDecor.cost()));

        Pizza meatPizzaDecor = new MeatHeaven();
        meatPizzaDecor = new Ham(meatPizzaDecor);
        meatPizzaDecor = new Chicken(meatPizzaDecor);
        meatPizzaDecor = new Cheese(meatPizzaDecor);
        System.out.println(meatPizzaDecor.getDescription() + ". $" + formatSum(meatPizzaDecor.cost()));

    }

    private static String formatSum(double sum) {
        return String.format(Locale.ROOT,
                             "%.2f",
                             sum);
    }
}
