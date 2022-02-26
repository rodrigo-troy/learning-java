package com.rodrigotroy.learning_java.comparable;

/**
 * Created with IntelliJ IDEA.
 * $ Project: learning-java
 * User: rodrigotroy
 * Date: 26-02-22
 * Time: 17:18
 */
public record Coin(int nominalValue, int mintYear) implements Comparable<Coin> {

    @Override
    public int compareTo(Coin other) {
        if (nominalValue == other.nominalValue) {
            return 0;
        } else if (nominalValue < other.nominalValue) {
            return -1;
        } else {
            return 1;
        }
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }

        if (that == null || getClass() != that.getClass()) {
            return false;
        }

        Coin coin = (Coin) that;

        return nominalValue == coin.nominalValue;
    }

    @Override
    public String toString() {
        return "Coin{nominal=" + nominalValue + ", year=" + mintYear + "}";
    }
}
