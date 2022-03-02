package com.rodrigotroy.learning_java.threads.basic;

import java.util.logging.Logger;

/**
 * Created with IntelliJ IDEA.
 * $ Project: learning_threads
 * User: rodrigotroy
 * Date: 20-01-21
 * Time: 13:23
 */
public class ThreadExample4 {
    private static final Logger LOG = Logger.getLogger("ThreadExample4");

    public static void main(String[] args) {
        LOG.info("INICIO EJEMPLO");

        Runnable runnable = () -> {
            String threadName = Thread.currentThread().getName();
            LOG.info("threadName = " + threadName);
            LOG.info(threadName + " running");

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                LOG.severe(e.getMessage());
            }

            LOG.info(threadName + " finished");
        };

        Thread thread1 = new Thread(runnable,
                                    "Juanito");
        thread1.start();

        Thread thread2 = new Thread(runnable);
        thread2.start();
    }
}
