package com.rodrigotroy.learning_java.serialization.example1;

import java.io.*;

/**
 * Created with IntelliJ IDEA.
 * $ Project: learning-java
 * User: rodrigotroy
 * Date: 22-04-22
 * Time: 17:44
 */
public class Motorcycle implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    private String make;
    private int year;
    private Engine engine;

    public Motorcycle(String make,
                      int year) {
        this.make = make;
        this.year = year;
        this.engine = new Engine(2.4,
                                 6);
    }

    public static void main(String[] args) throws
                                           IOException,
                                           ClassNotFoundException {
        Motorcycle toyota = new Motorcycle("Toyota",
                                           2021);
        Motorcycle honda = new Motorcycle("Honda",
                                          2020);
        FileOutputStream fileOutputStream = new FileOutputStream("Motorcycles.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(toyota);
        objectOutputStream.writeObject(honda);

        FileInputStream fileInputStream = new FileInputStream("Motorcycles.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

        Motorcycle toyotaCopy = (Motorcycle) objectInputStream.readObject();
        Motorcycle hondaCopy = (Motorcycle) objectInputStream.readObject();

        boolean isSameObject = toyotaCopy == toyota;
        System.out.println("Toyota (Copy) - " + toyotaCopy);
        System.out.println("Toyota (Original) - " + toyota);
        System.out.println("Is same object: " + isSameObject);
    }

    @Serial
    private void writeObject(ObjectOutputStream stream) throws
                                                        IOException {
        stream.writeObject(this.make);
        stream.writeInt(this.year);
        stream.writeDouble(this.engine.getLiters());
        stream.writeInt(this.engine.getCylinders());
    }

    @Serial
    private void readObject(ObjectInputStream stream) throws
                                                      IOException,
                                                      ClassNotFoundException {
        this.make = (String) stream.readObject();
        this.year = stream.readInt();
        double liters = stream.readDouble();
        int cylinders = stream.readInt();
        this.engine = new Engine(liters,
                                 cylinders);
    }

    public String toString() {
        return String.format("Motorcycle make is: %s, Motorcycle year is: %d, %s",
                             this.make,
                             this.year,
                             this.engine);
    }
}
