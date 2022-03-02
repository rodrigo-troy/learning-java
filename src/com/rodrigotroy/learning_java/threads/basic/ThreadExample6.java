package com.rodrigotroy.learning_java.threads.basic;

import java.util.logging.Logger;

/**
 * Created with IntelliJ IDEA.
 * $ Project: learning_threads
 * User: rodrigotroy
 * Date: 20-01-21
 * Time: 13:23
 * Aunque el Thread principal termine, si hay un Thread corriendo, la maquina virtual continuará corriendo.
 * Se puede evitar esto usando thread.setDaemon(true), pero el daemon thread terminará en un estado indeterminado.
 */
public class ThreadExample6 {
    private static final Logger LOG = Logger.getLogger("ThreadExample6");

    public static void main(String[] args) {
        LOG.info("INICIO EJEMPLO");

        Runnable runnable = () -> {
            while (true) {
                sleep(1000);
                LOG.info("Running");
            }
        };

        Thread thread = new Thread(runnable);
        thread.setDaemon(true);
        thread.start();
        sleep(3100);
    }

    public static void sleep(int millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            LOG.severe(e.getMessage());
        }
    }
}
