package com.rodrigotroy.learning_java.design.pattern.builder.example1;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * $ Project: learning-java
 * User: rodrigotroy
 * Date: 14-05-22
 * Time: 18:14
 */
public class Main {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final Robot.RobotBuilder robotBuilder = new Robot.RobotBuilder();/* write your code here */
        /* Set CPU */
        robotBuilder.setCPU("Intel Core i5");
        /* Would like to set legs? */
        int legs = scanner.nextInt();
        robotBuilder.setLegs(legs);
        /* Would like to set hands? */
        int hands = scanner.nextInt();
        robotBuilder.setHands(hands);
        /* Would like to set eyes? */
        int eyes = scanner.nextInt();
        robotBuilder.setEyes(eyes);

        Robot robot = robotBuilder.build();

        System.out.println(robot);
        scanner.close();
    }
}
