package com.rodrigotroy.learning_java.algorithm.minimax1;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created with IntelliJ IDEA.
 * $ Project: learning-java
 * User: rodrigotroy
 * Date: 07-03-22
 * Time: 22:13
 */

public class MinimaxTest {
    @Test
    public void test() {
        MiniMax miniMax = new MiniMax();
        miniMax.constructTree(8);

        boolean result = miniMax.checkWin();

        Assert.assertTrue(result);

        /*miniMax.constructTree(8);
        result = miniMax.checkWin();

        Assert.assertFalse(result);*/
    }
}
