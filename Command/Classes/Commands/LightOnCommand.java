package DesignPatterns.Command.Classes.Commands;

import DesignPatterns.Command.Classes.ICommand.ICommand;
import DesignPatterns.Command.Classes.Receiver.Light;

public class LightOnCommand implements ICommand {

    private final Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }


    @Override
    public void execute() {
        System.out.println(this.light.on());
    }

    @Override
    public String toString() {
        return "LightOnCommand{" +
                "light=" + light +
                '}';
    }

    @Override
    public void unxecute() {
        this.light.off();
    }
}
