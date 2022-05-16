package DesignPatterns.Command.Classes.Commands;

import DesignPatterns.Command.Classes.ICommand.ICommand;
import DesignPatterns.Command.Classes.Receiver.Light;

public class LightOffCommand implements ICommand {


    private final Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        System.out.println(this.light.off());
    }


    @Override
    public void unxecute() {
        this.light.on();
    }
}
