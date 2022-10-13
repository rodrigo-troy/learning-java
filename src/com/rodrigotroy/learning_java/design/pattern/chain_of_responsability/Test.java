package com.rodrigotroy.learning_java.design.pattern.chain_of_responsability;

/**
 * Created with IntelliJ IDEA.
 * User: rodrigotroy
 * Date: 6/6/12
 * Time: 12:04 PM
 * To change this template use File | Settings | File Templates.
 */
public class Test {
    public static void main(String[] args) {
        // Setup Chain of Responsibility
        Handler h1 = new ConcreteHandlerOne();
        Handler h2 = new ConcreteHandlerTwo();
        Handler h3 = new ConcreteHandlerThree();

        h1.setSuccessor(h2);
        h2.setSuccessor(h3);

        // Send requests to the chain
        h1.handleRequest(new Request("Negative Value ",
                                     -1));
        h1.handleRequest(new Request("Negative Value ",
                                     0));
        h1.handleRequest(new Request("Negative Value ",
                                     1));
        h1.handleRequest(new Request("Negative Value ",
                                     2));
        h1.handleRequest(new Request("Negative Value ",
                                     -5));
    }
}
