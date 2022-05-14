package com.rodrigotroy.learning_java.design.pattern.builder.example1;

/**
 * Created with IntelliJ IDEA.
 * $ Project: learning-java
 * User: rodrigotroy
 * Date: 14-05-22
 * Time: 18:14
 */
public class Robot {
    private final String CPU;
    private final int legs;
    private final int hands;
    private final int eyes;

    Robot(String CPU,
          int legs,
          int hands,
          int eyes) {
        this.CPU = CPU;
        this.legs = legs;
        this.hands = hands;
        this.eyes = eyes;
    }

    public String getCPU() {
        return CPU;
    }

    public int getLegs() {
        return legs;
    }

    public int getHands() {
        return hands;
    }

    public int getEyes() {
        return eyes;
    }

    @Override
    public String toString() {
        return "CPU : " + CPU + "\n" +
               "Legs : " + legs + "\n" +
               "Hands : " + hands + "\n" +
               "Eyes : " + eyes + "\n";
    }

    public static class RobotBuilder {

        /* write your code here (fields) */
        private String CPU;
        private int legs;
        private int hands;
        private int eyes;

        RobotBuilder setCPU(String cpu) {
            this.CPU = cpu;
            return this;
        }

        RobotBuilder setLegs(int legs) {
            this.legs = legs;
            return this;
        }

        RobotBuilder setHands(int hands) {
            this.hands = hands;
            return this;
        }

        RobotBuilder setEyes(int eyes) {
            this.eyes = eyes;
            return this;
        }

        Robot build() {
            return new Robot(this.CPU,
                             this.legs,
                             this.hands,
                             this.eyes);
        }
    }
}
