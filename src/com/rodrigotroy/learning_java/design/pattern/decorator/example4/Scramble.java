package com.rodrigotroy.learning_java.design.pattern.decorator.example4;

/**
 * Created with IntelliJ IDEA.
 * User: rodrigotroy
 * Date: 6/6/12
 * Time: 4:49 PM
 * To change this template use File | Settings | File Templates.
 */
public class Scramble extends Decorator {
    public Scramble(LCD inner) {
        super(inner);
    }

    public void write(String[] s) {
        super.write(s);
        System.out.println("encrypt:");
        StringBuffer sb = new StringBuffer(s[0]);

        for (int i = 0; i < sb.length(); i++) {
            sb.setCharAt(i,
                         (char) (sb.charAt(i) - 5));
        }

        s[0] = sb.toString();
    }

    public void read(String[] s) {
        StringBuffer sb = new StringBuffer(s[0]);

        for (int i = 0; i < sb.length(); i++) {
            sb.setCharAt(i,
                         (char) (sb.charAt(i) + 5));
        }

        s[0] = sb.toString();
        System.out.println("decrypt:");
        super.read(s);
    }
}

