package com.rodrigotroy.learning_java.algorithm.minimax1;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * $ Project: learning-java
 * User: rodrigotroy
 * Date: 07-03-22
 * Time: 22:07
 */
public class GameOfBones {
    static List<Integer> getPossibleStates(int noOfBonesInHeap) {
        System.out.printf("noOfBonesInHeap: %d\n",
                          noOfBonesInHeap);
        List<Integer> list = new ArrayList<>();

        for (int i = 1; i <= 3; i++) {
            int newHeapCount = noOfBonesInHeap - i;

            if (newHeapCount >= 0) {
                list.add(newHeapCount);
            }
        }

        System.out.println(list);
        return list;
    }
}
