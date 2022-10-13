package com.rodrigotroy.learning_java.design.pattern.chain_of_responsability;

/**
 * Created with IntelliJ IDEA.
 * User: rodrigotroy
 * Date: 6/6/12
 * Time: 11:50 AM
 * To change this template use File | Settings | File Templates.
 */
public class ConcreteHandlerThree extends Handler {

    public void handleRequest(Request request) {
        if (request.getValue() >= 0) {           //if request is eligible handle it
            System.out.println("Zero values are handled by ConcreteHandlerThree:");
            System.out.println("\tConcreteHandlerThree.HandleRequest : " + request.getDescription()
                               + request.getValue());
        } else {
            this.m_successor.handleRequest(request);
        }
    }
}
