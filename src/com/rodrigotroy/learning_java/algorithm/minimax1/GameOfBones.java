package com.rodrigotroy.learning_java.algorithm.minimax1;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Created with IntelliJ IDEA.
 * $ Project: learning-java
 * User: rodrigotroy
 * Date: 07-03-22
 * Time: 22:07
 */
public class GameOfBones {
    static List<Integer> getPossibleStates(int noOfBonesInHeap) {
        return IntStream.rangeClosed(1,
                                     3)
                        .boxed()
                        .map(i -> noOfBonesInHeap - i)
                        .filter(newHeapCount -> newHeapCount >= 0)
                        .collect(Collectors.toList());
    }
}
