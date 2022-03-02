package com.rodrigotroy.learning_java.threads.sync.file;

/**
 * Created with IntelliJ IDEA.
 * $ Project: learning_threads
 * User: rodrigotroy
 * Date: 23-01-21
 * Time: 14:25
 */
public class MyRunnable implements Runnable {
    private final TextFile textFile;

    public MyRunnable(TextFile textFile) {
        this.textFile = textFile;
    }

    @Override
    public void run() {
        this.textFile.printText(Thread.currentThread().getName());
    }
}
