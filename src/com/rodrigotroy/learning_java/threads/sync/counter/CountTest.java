package com.rodrigotroy.learning_java.threads.sync.counter;


import java.util.logging.Logger;

/**
 * Created with IntelliJ IDEA.
 * $ Project: learning_threads
 * User: rodrigotroy
 * Date: 25-01-21
 * Time: 15:06
 */
public class CountTest {
    private static final Logger LOG = Logger.getLogger("CountTest");

    public static void main(String[] args) {
        LOG.info("INICIO TEST");

        SimpleCount simpleCount = new SimpleCount();
        SynchronizedCount synchronizedCount = new SynchronizedCount();

        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 1_000_000; i++) {
                simpleCount.increment();
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 1_000_000; i++) {
                simpleCount.increment();
            }
        });

        Thread thread3 = new Thread(() -> {
            for (int i = 0; i < 1_000_000; i++) {
                synchronizedCount.increment();
            }
        });

        Thread thread4 = new Thread(() -> {
            for (int i = 0; i < 1_000_000; i++) {
                synchronizedCount.increment();
            }
        });

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();

        try {
            thread1.join();
            thread2.join();
            thread3.join();
            thread4.join();
        } catch (InterruptedException e) {
            LOG.severe(e.getMessage());
        }

        LOG.info("Simple: " + simpleCount.getCount());
        LOG.info("Sync: " + synchronizedCount.getCount());
    }
}
