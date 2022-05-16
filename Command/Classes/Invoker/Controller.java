package DesignPatterns.Command.Classes.Invoker;

import DesignPatterns.Command.Classes.Commands.LightOffCommand;
import DesignPatterns.Command.Classes.Commands.LightOnCommand;

public class Controller {

    private final LightOffCommand lightOffCommand;
    private final LightOnCommand lightOnCommand;

    public Controller(LightOffCommand lightOffCommand, LightOnCommand lightOnCommand) {
        this.lightOffCommand = lightOffCommand;
        this.lightOnCommand = lightOnCommand;
    }

    public void turnLightOn(){
        lightOnCommand.execute();
    }

    public void turnLightOff(){
        lightOffCommand.execute();
    }

}
