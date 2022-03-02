package com.rodrigotroy.learning_java.threads.basic;

import java.util.logging.Logger;

/**
 * Created with IntelliJ IDEA.
 * $ Project: learning_threads
 * User: rodrigotroy
 * Date: 20-01-21
 * Time: 13:23
 */
public class ThreadExample3 {
    private static final Logger LOG = Logger.getLogger("ThreadExample3");

    public static void main(String[] args) {
        LOG.info("INICIO EJEMPLO");

        MyRunnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable);
        thread.start();
    }

    public static class MyRunnable implements Runnable {
        private static final Logger LOG = Logger.getLogger("MyRunnable");

        public void run() {
            LOG.info("MyRunnable running");
            LOG.info("MyRunnable finished");
        }
    }
}
