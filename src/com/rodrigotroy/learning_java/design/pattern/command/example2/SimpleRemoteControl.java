package com.rodrigotroy.learning_java.design.pattern.command.example2;

//
// This is the invoker
//
public class SimpleRemoteControl {

    Command slot;

    public SimpleRemoteControl() {
    }

    public void setCommand(Command command) {
        slot = command;
    }

    public void buttonWasPressed() {
        slot.execute();
    }
}
