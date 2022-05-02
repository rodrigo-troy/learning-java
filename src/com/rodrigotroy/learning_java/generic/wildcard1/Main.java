package com.rodrigotroy.learning_java.generic.wildcard1;

/**
 * Created with IntelliJ IDEA.
 * $ Project: learning-java
 * User: rodrigotroy
 * Date: 02-05-22
 * Time: 20:17
 */
public class Main {
    public static void main(String[] args) {
        Bus<Student> studentBus = new Bus<>(new Student("Mike",
                                                        "Math"));
        Bus<SchoolPerson> personBus = new Bus<>(new SchoolPerson("Jerry"));

        transferData(studentBus,
                     personBus);
    }

    public static void transferData(Bus<? extends Student> src,
                                    Bus<? super SchoolPerson> dsc) {
        System.out.print("dsc bus rider before switch: ");
        dsc.printRider();
        Student studentInSrcBus = src.getRider();
        System.out.print("dsc bus rider after switch: ");
        dsc.setRider(studentInSrcBus);
        dsc.printRider();
    }
}
