package com.rodrigotroy.learning_java.enums.robot;

/**
 * Created with IntelliJ IDEA.
 * $ Project: learning-java
 * User: rodrigotroy
 * Date: 27-03-22
 * Time: 14:15
 */
public enum Direction {
    UP(0,
       1),
    DOWN(0,
         -1),
    LEFT(-1,
         0),
    RIGHT(1,
          0);

    private final int dx;
    private final int dy;

    Direction(int dx,
              int dy) {
        this.dx = dx;
        this.dy = dy;
    }

    public Direction turnLeft() {
        return switch (this) {
            case UP -> LEFT;
            case DOWN -> RIGHT;
            case LEFT -> DOWN;
            case RIGHT -> UP;
            default -> throw new IllegalStateException();
        };
    }

    public Direction turnRight() {
        return switch (this) {
            case UP -> RIGHT;
            case DOWN -> LEFT;
            case LEFT -> UP;
            case RIGHT -> DOWN;
            default -> throw new IllegalStateException();
        };
    }

    public int dx() {
        return dx;
    }

    public int dy() {
        return dy;
    }
}
