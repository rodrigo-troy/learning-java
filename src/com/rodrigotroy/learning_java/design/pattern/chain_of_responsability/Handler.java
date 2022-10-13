package com.rodrigotroy.learning_java.design.pattern.chain_of_responsability;

/**
 * Created with IntelliJ IDEA.
 * User: rodrigotroy
 * Date: 6/6/12
 * Time: 11:49 AM
 * To change this template use File | Settings | File Templates.
 */
public abstract class Handler {
    protected Handler m_successor;

    public void setSuccessor(Handler successor) {
        m_successor = successor;
    }

    public abstract void handleRequest(Request request);
}
