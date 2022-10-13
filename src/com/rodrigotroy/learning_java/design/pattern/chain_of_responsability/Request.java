package com.rodrigotroy.learning_java.design.pattern.chain_of_responsability;

/**
 * Created with IntelliJ IDEA.
 * User: rodrigotroy
 * Date: 6/6/12
 * Time: 11:48 AM
 * To change this template use File | Settings | File Templates.
 */
public class Request {
    private final int m_value;
    private final String m_description;

    public Request(String description,
                   int value) {
        m_description = description;
        m_value = value;
    }

    public int getValue() {
        return m_value;
    }

    public String getDescription() {
        return m_description;
    }
}
