package com.rodrigotroy.learning_java.design.pattern.command.example1;

public class LivingroomLightOnCommand implements Command {

    Light light;

    public LivingroomLightOnCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        light.on();
    }

    public void undo() {
        light.off();
    }
}
