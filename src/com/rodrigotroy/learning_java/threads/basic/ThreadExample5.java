package com.rodrigotroy.learning_java.threads.basic;

import java.util.logging.Logger;

/**
 * Created with IntelliJ IDEA.
 * $ Project: learning_threads
 * User: rodrigotroy
 * Date: 20-01-21
 * Time: 13:23
 */
public class ThreadExample5 {
    private static final Logger LOG = Logger.getLogger("ThreadExample5");

    public static void main(String[] args) {
        LOG.info("INICIO EJEMPLO");

        StoppableRunnable stoppableRunnable = new StoppableRunnable();
        Thread thread = new Thread(stoppableRunnable);
        thread.start();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            LOG.severe(e.getMessage());
        }

        LOG.info("Requesting stop");
        stoppableRunnable.requestStop();
        LOG.info("stop requested");
    }

    public static class StoppableRunnable implements Runnable {
        private static final Logger LOG = Logger.getLogger("StoppableRunnable");

        private Boolean stopRequest = false;

        public synchronized void requestStop() {
            this.stopRequest = true;
        }

        public synchronized boolean isStopRequested() {
            return this.stopRequest;
        }

        public void sleep(long millis) {
            try {
                Thread.sleep(millis);
            } catch (InterruptedException e) {
                LOG.severe(e.getMessage());
            }
        }

        @Override
        public void run() {
            LOG.info("StoppableRunnable running");

            while (!isStopRequested()) {
                sleep(1000);
                LOG.info("running...");
            }

            LOG.info("StoppableRunnable stopped");
        }
    }
}
