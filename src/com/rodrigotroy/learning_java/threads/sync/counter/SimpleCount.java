package com.rodrigotroy.learning_java.threads.sync.counter;

/**
 * Created with IntelliJ IDEA.
 * $ Project: learning_threads
 * User: rodrigotroy
 * Date: 25-01-21
 * Time: 15:06
 */
public class SimpleCount {
    private Integer count = 0;

    public Integer getCount() {
        return count;
    }

    public void increment() {
        this.count++;
    }
}
