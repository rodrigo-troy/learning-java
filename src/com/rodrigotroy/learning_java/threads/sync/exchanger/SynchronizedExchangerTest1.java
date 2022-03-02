package com.rodrigotroy.learning_java.threads.sync.exchanger;

import java.util.logging.Logger;

/**
 * Created with IntelliJ IDEA.
 * $ Project: learning_threads
 * User: rodrigotroy
 * Date: 22-01-21
 * Time: 16:47
 */
public class SynchronizedExchangerTest1 {
    private static final Logger LOG = Logger.getLogger("SynchronizedExchangerTest1");

    public static void main(String[] args) {
        LOG.info("INICIO TEST");

        SynchronizedExchanger exchanger = new SynchronizedExchanger();

        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                exchanger.setObject("" + i);
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                LOG.info(exchanger.getObject().toString());
            }
        });

        thread1.start();
        thread2.start();
    }
}
