package game_logic.commands;

import game_logic.Game;

import java.util.Map;
import java.util.Set;

public class CmdFactory {
    private String[] args;
    private Map<String, ICommand> mapOfCommands;

    public void register(String cmdName, ICommand command){
        if (!mapOfCommands.containsKey(cmdName)){
            mapOfCommands.put(cmdName,command);
        }
    }
    public Set<String> getAvailableCommands(){
        return mapOfCommands.keySet();
    }
    public ICommand buildCommand(Game game,String[] args){
        return null;
    }

}
