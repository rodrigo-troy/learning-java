package com.rodrigotroy.learning_java.design.pattern.proxy.example1;

import java.io.Serializable;

public interface State extends Serializable {

    void insertQuarter();

    void ejectQuarter();

    void turnCrank();

    void dispense();
}
