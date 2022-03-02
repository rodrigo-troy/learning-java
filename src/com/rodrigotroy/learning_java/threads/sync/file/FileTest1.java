package com.rodrigotroy.learning_java.threads.sync.file;

import java.util.logging.Logger;

/**
 * Created with IntelliJ IDEA.
 * $ Project: learning_threads
 * User: rodrigotroy
 * Date: 23-01-21
 * Time: 14:15
 */
public class FileTest1 {
    private static final Logger LOG = Logger.getLogger("FileTest1");

    public static void main(String[] args) {
        LOG.info("INICIO TEST");

        TextFile textFile = new TextFile();

        Thread thread1 = new Thread(new MyRunnable(textFile));
        Thread thread2 = new Thread(new MyRunnable(textFile));
        Thread thread3 = new Thread(new MyRunnable(textFile));
        Thread thread4 = new Thread(new MyRunnable(textFile));
        Thread thread5 = new Thread(new MyRunnable(textFile));
        Thread thread6 = new Thread(new MyRunnable(textFile));

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
        thread6.start();
    }
}
