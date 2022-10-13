package com.rodrigotroy.learning_java.design.pattern.decorator.example3;

import com.rodrigotroy.learning_java.design.pattern.decorator.example3.beverage.Beverage;
import com.rodrigotroy.learning_java.design.pattern.decorator.example3.beverage.DarkRoast;
import com.rodrigotroy.learning_java.design.pattern.decorator.example3.beverage.Espresso;
import com.rodrigotroy.learning_java.design.pattern.decorator.example3.beverage.HouseBlend;
import com.rodrigotroy.learning_java.design.pattern.decorator.example3.condiment.Mocha;
import com.rodrigotroy.learning_java.design.pattern.decorator.example3.condiment.Soy;
import com.rodrigotroy.learning_java.design.pattern.decorator.example3.condiment.Whip;

public class StarbuzzCoffee {

    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        Beverage beverage2 = new DarkRoast();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription() + " $" + beverage2.cost());

        Beverage beverage3 = new HouseBlend();
        beverage3 = new Soy(beverage3);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Whip(beverage3);
        System.out.println(beverage3.getDescription() + " $" + beverage3.cost());
    }
}
