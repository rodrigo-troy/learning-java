package com.rodrigotroy.learning_java.design.pattern.chain_of_responsability;

/**
 * Created with IntelliJ IDEA.
 * User: rodrigotroy
 * Date: 6/6/12
 * Time: 11:49 AM
 * To change this template use File | Settings | File Templates.
 */
public class ConcreteHandlerOne extends Handler {

    public void handleRequest(Request request) {
        if (request.getValue() < 0) {           //if request is eligible handle it
            System.out.println("Negative values are handled by ConcreteHandlerOne:");
            System.out.println("\tConcreteHandlerOne.HandleRequest : " + request.getDescription() + request.getValue());
        } else {
            this.m_successor.handleRequest(request);
        }
    }
}
