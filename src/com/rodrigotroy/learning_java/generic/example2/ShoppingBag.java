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
public class ShoppingBag<T extends Number> {
    private final Map<PricedItem<T>, Integer> shoppingBag;

    public ShoppingBag() {
        this.shoppingBag = new HashMap<>();
    }

    public void addItem(PricedItem<T> item) {
        this.shoppingBag.put(item,
                             this.shoppingBag.values().size() + 1);
    }

    public int getTotalPrice() {
        int total = 0;

        for (PricedItem<T> item : this.shoppingBag.keySet()) {
            total += item.getPrice().intValue() * this.shoppingBag.get(item);
        }

        return 0;
    }
}
