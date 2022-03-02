package com.rodrigotroy.learning_java.threads.basic;

import java.util.logging.Logger;

/**
 * Created with IntelliJ IDEA.
 * $ Project: learning_threads
 * User: rodrigotroy
 * Date: 20-01-21
 * Time: 13:23
 * thread.join(); permite que el thread principal espere a los threads que estan corriendo, que terminen.
 */
public class ThreadExample7 {
    private static final Logger LOG = Logger.getLogger("ThreadExample7");

    public static void main(String[] args) {
        LOG.info("INICIO EJEMPLO");

        Runnable runnable = () -> {
            for (int i = 0; i < 5; i++) {
                sleep(1000);
                LOG.info("Running");
            }
        };

        Thread thread = new Thread(runnable);
        thread.setDaemon(true);
        thread.start();

        try {
            thread.join();
        } catch (InterruptedException e) {
            LOG.severe(e.getMessage());
        }
    }

    public static void sleep(int millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            LOG.severe(e.getMessage());
        }
    }
}
