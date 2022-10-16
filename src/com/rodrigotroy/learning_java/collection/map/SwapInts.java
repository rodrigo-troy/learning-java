package com.rodrigotroy.learning_java.collection.map;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * $ Project: learning-java
 * User: rodrigotroy
 * Date: 15-10-22
 * Time: 22:30
 */
public class SwapInts {


    public static int[] swapInts(int[] ints) {
        System.out.println(ints[0] + "," + ints[1]);
        return new int[]{ints[1], ints[0]};
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] ints = new int[2];
        ints[0] = Integer.parseInt(scanner.nextLine());
        ints[1] = Integer.parseInt(scanner.nextLine());

        int[] ints1 = SwapInts.swapInts(ints);

        System.out.println(ints1[0]);
        System.out.println(ints1[1]);
    }

}
