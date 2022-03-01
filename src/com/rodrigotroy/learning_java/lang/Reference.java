package com.rodrigotroy.learning_java.lang;

/**
 * Created with IntelliJ IDEA.
 * $ Project: learning-java
 * User: rodrigotroy
 * Date: 01-03-22
 * Time: 14:04
 */
public class Reference {
    public static void main(String[] args) {
        Reference r = new Reference();

        Integer value = 1;

        r.applyNull(value);
        System.out.printf("outside applyValue, after set null: %s\n",
                          value);
    }

    private void applyNull(Object value) {
        System.out.printf("inside applyValue, before set null: %s\n",
                          value);
        value = null;
        System.out.printf("inside applyValue, after set null: %s\n",
                          value);
    }
}
