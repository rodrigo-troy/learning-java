package com.rodrigotroy.learning_java.enums.robot;

/**
 * Created with IntelliJ IDEA.
 * $ Project: learning-java
 * User: rodrigotroy
 * Date: 27-03-22
 * Time: 14:19
 */
public class Move {
    public static void moveRobot(Robot robot,
                                 int toX,
                                 int toY) {

        if (toX < robot.getX()) {
            while (!robot.getDirection().equals(Direction.LEFT)) {
                robot.turnLeft();
            }

            while (robot.getX() != toX) {
                robot.stepForward();
            }
        }

        if (toX > robot.getX()) {
            while (!robot.getDirection().equals(Direction.RIGHT)) {
                robot.turnRight();
            }

            while (robot.getX() != toX) {
                robot.stepForward();
            }
        }

        if (toY < robot.getY()) {
            while (!robot.getDirection().equals(Direction.DOWN)) {
                robot.turnLeft();
            }

            while (robot.getY() != toY) {
                robot.stepForward();
            }
        }

        if (toY > robot.getY()) {
            while (!robot.getDirection().equals(Direction.UP)) {
                robot.turnLeft();
            }

            while (robot.getY() != toY) {
                robot.stepForward();
            }
        }
    }
}
