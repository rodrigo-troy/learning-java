package com.rodrigotroy.learning_java.generic.example2;

import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * $ Project: learning-java
 * User: rodrigotroy
 * Date: 15-05-22
 * Time: 17:37
 */
public class ShoppingBag<T extends PricedItem<Integer>> {
    private final Map<T, Integer> shoppingBag;

    public ShoppingBag() {
        this.shoppingBag = new HashMap<>();
    }

    public void addItem(T item) {
        this.shoppingBag.put(item,
                             this.shoppingBag.containsKey(item) ? this.shoppingBag.get(item) + 1 : 1);
    }

    public int getTotalPrice() {
        int total = 0;

        for (T item : this.shoppingBag.keySet()) {
            total += item.getPrice() * this.shoppingBag.get(item);
        }

        return total;
    }
}
