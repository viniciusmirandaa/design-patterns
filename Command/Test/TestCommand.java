package DesignPatterns.Command.Test;

import DesignPatterns.Command.Classes.Commands.LightOffCommand;
import DesignPatterns.Command.Classes.Commands.LightOnCommand;
import DesignPatterns.Command.Classes.Invoker.Controller;
import DesignPatterns.Command.Classes.Receiver.Light;

public class TestCommand {
    public static void main(String[] args) {
        Light light = new Light();
        LightOnCommand lightOnCommand = new LightOnCommand(light);
        LightOffCommand lightOffCommand = new LightOffCommand(light);
        Controller controller = new Controller(lightOffCommand, lightOnCommand);

        controller.turnLightOn();
        controller.turnLightOff();
    }
}
