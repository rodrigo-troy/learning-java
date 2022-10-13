package com.rodrigotroy.learning_java.solid.liskov.example1;

/**
 * Square class; Square inherits from Rectangle;
 * Represents ISA relationship - Square is a Rectangle
 *
 * @author Ajitesh Shukla
 */
public class Square extends Rectangle {
    @Override
    public void setBreadth(int breadth) {
        super.setBreadth(breadth);
        super.setLength(breadth);
    }

    @Override
    public void setLength(int length) {
        super.setLength(length);
        super.setBreadth(length);
    }
}
