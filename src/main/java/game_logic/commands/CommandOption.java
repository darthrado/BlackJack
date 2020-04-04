package game_logic.commands;

import game_logic.Game;

import java.util.Collections;
import java.util.List;

public class CommandOption {
    private String commandName;
    private List<String> args;
    private Game sender;

    public String getSender() {
        return sender.getGameId().toString();
    }

    public CommandOption(String commandName, List<String> args, Game sender) {
        this.commandName = commandName;
        this.args = args;
        this.sender = sender;
    }

    public String getCommandName() {
        return commandName;
    }

    public List<String> getArgs() {
        return Collections.unmodifiableList(args);
    }

    public void execute(List<String> args){
        sender.choseOption(commandName, args);
    }

    @Override
    public String toString() {
        return commandName+args.toString();
    }
}
