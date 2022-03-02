package com.rodrigotroy.learning_java.threads.sync.file;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.logging.Logger;

/**
 * Created with IntelliJ IDEA.
 * $ Project: learning_threads
 * User: rodrigotroy
 * Date: 23-01-21
 * Time: 14:15
 * Si se quita el synchronized, la impresión es mas desordenada debido a que los hilos
 * no respetan la ejecución por hilos del metodo.
 */
public class TextFile {
    private static final Logger LOG = Logger.getLogger("TextFile");

    public synchronized void printText(String threadName) {
        LOG.info("INICIO LECTURA ARCHIVO");

        for (int i = 0; i < 1000; i++) {
            StringBuilder content = new StringBuilder(threadName);
            content.append(": ");

            var fileName1 = TextFile.class.getClassLoader().getResource("file1.txt");
            var filePath1 = Paths.get(fileName1.getPath());

            try {
                content.append(Files.readString(filePath1).trim());
            } catch (IOException e) {
                LOG.severe(e.getMessage());
            }

            content.append(" ");

            var fileName2 = TextFile.class.getClassLoader().getResource("file2.txt");
            var filePath2 = Paths.get(fileName2.getPath());

            try {
                content.append(Files.readString(filePath2).trim());
            } catch (IOException e) {
                LOG.severe(e.getMessage());
            }

            content.append(" | ");
            content.append(i);

            LOG.info(content.toString());
        }
    }
}
