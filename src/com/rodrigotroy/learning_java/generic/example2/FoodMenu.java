package com.rodrigotroy.learning_java.generic.example2;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * $ Project: learning-java
 * User: rodrigotroy
 * Date: 15-05-22
 * Time: 18:53
 */
public class FoodMenu {
    private final List<Food> menu;

    public FoodMenu() {
        this.menu = new ArrayList<>();
        this.menu.add(new Food("Rice",
                               "Delicious rice",
                               100));
        this.menu.add(new Food("Noodles",
                               "Delicious noodles",
                               130));
        this.menu.add(new Food("Burger",
                               "Super burger",
                               150));
    }

    public Food getLowestCostFood() {
        Food cheaper = null;

        for (Food food : this.menu) {
            if (cheaper == null) {
                cheaper = food;
            } else if (cheaper.getPrice() > food.getPrice()) {
                cheaper = food;
            }
        }

        return cheaper;
    }

    public Food getFood(int number) {
        if (number == 0 || number > this.menu.size()) {
            return null;
        }

        return this.menu.get(number - 1);
    }

    @Override
    public String toString() {
        int x = 1;
        StringBuilder text = new StringBuilder();

        for (Food food : this.menu) {
            text.append(x);
            text.append(". ");
            text.append(food.getDescription());
            text.append("     ");
            text.append("Cost: $");
            text.append(food.getPrice());
            text.append("\n");
            x++;
        }

        return text.toString();
    }
}
