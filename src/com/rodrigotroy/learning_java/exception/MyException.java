package com.rodrigotroy.learning_java.exception;

/**
 * Created with IntelliJ IDEA.
 * $ Project: learning-java
 * User: rodrigotroy
 * Date: 22-04-22
 * Time: 17:41
 */
public class MyException extends Throwable {
    public MyException(String message) {
        super(message);
    }

    public static void main(String[] args) {
        MyException myException = new MyException("This is a custom exception");
        System.out.println(myException.getMessage());
        Class<?> superClass = myException.getClass().getSuperclass();
        System.out.println(superClass.equals(Throwable.class));
    }
}
