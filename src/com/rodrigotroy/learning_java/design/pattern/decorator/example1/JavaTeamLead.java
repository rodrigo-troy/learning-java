package com.rodrigotroy.learning_java.design.pattern.decorator.example1;

/**
 * Created with IntelliJ IDEA.
 * $ Project: learning-java
 * User: rodrigotroy
 * Date: 30-03-22
 * Time: 12:36
 */
public class JavaTeamLead extends DeveloperDecorator {

    public JavaTeamLead(Developer developer) {
        super(developer);
    }

    public String sendWeekReport() {
        return "Send week report to customers.";
    }

    public String makeJob() {
        return super.makeJob() + " " + sendWeekReport();
    }
}
