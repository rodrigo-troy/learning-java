package com.rodrigotroy.learning_java.threads.basic;

import java.util.logging.Logger;

/**
 * Created with IntelliJ IDEA.
 * $ Project: learning_threads
 * User: rodrigotroy
 * Date: 20-01-21
 * Time: 13:23
 */
public class ThreadExample2 {
    private static final Logger LOG = Logger.getLogger("ThreadExample2");

    public static void main(String[] args) {
        LOG.info("Start...");
        MyThread thread = new MyThread();
        thread.start();
    }

    public static class MyThread extends Thread {
        private static final Logger LOG = Logger.getLogger("MyThread");

        public void run() {
            LOG.info("Thread running");
            LOG.info("Thread finished");
        }
    }
}
