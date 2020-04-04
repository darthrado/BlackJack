package game_logic;

import game_logic.commands.CommandOption;
import game_logic.game_states.IGameState;
import game_logic.game_states.InitialState;

import java.rmi.server.UID;
import java.util.*;

public class Game {

    private IGameState state;
    private List<Player> players;
    private boolean isRunning;
    private UID gameId;

    public UID getGameId() {
        return gameId;
    }

    public Game() {
        state = new InitialState();
        players = new ArrayList<>();
        gameId = new UID();
    }

    public void startGame(){
        //set game state to Waiting For players
        isRunning = true;
        //while ()
        //while isRunning gameState!=WaitingForPlayers loop

        //gameState.advanceGameState
    }
    public void addPlayer(Player player){
        players.add(player);
    }

    public boolean isRunning(){
        return isRunning;
    }

    public void getState() {
        System.out.println("Dealer Hand:");
    }

    public List<CommandOption> getPlayerOptions() {
        List<CommandOption> out = new ArrayList<>();
        out.add(new CommandOption("Hit", Collections.emptyList(),this));
        out.add(new CommandOption("Bet", List.of("Amount"),this));
        out.add(new CommandOption("Stay", Collections.emptyList(),this));
        out.add(new CommandOption("Quit", Collections.emptyList(),this));

        return out;
    }

    public void choseOption(String option, List<String> args) {
        switch (option){
            case "Hit":
                System.out.println("Player Hits!"); break;
            case "Stay":
                System.out.println("Player Stays!"); break;
            case "Bet":
                System.out.println("Player Bets"+ args.get(0)); break;
            case "Quit":{
                System.out.println("Player left the table"); isRunning = false; break;
            }

        }

    }

    //a game has state
    //a game has players
    //a game can advance state
    //a game has a custom rule set

    //Construct a new game with an initial state and a list of rules and initial game state

    //start game

    //end game

    //get current state

    //add player

    //remove player

    //request player input

    //get player input

    //internal methods
      //

}
