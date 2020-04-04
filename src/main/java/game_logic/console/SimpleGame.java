package game_logic.console;

import game_logic.Game;
import game_logic.Player;
import game_logic.commands.CommandOption;

import java.rmi.server.UID;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SimpleGame {
    public static void main(String[] args) {

        Game game1 = new Game();
        Player player1 = new Player(new UID(),1000);

        game1.startGame();
        game1.addPlayer(player1);

        while (game1.isRunning()){
            game1.getState();
            List<CommandOption> options = game1.getPlayerOptions();
            System.out.println(options.toString());
            Scanner choice = new Scanner(System.in);

            CommandOption chosenOpt = options.get(choice.nextInt());

            List<String> inArgs = new ArrayList<>();
            for (String arg:chosenOpt.getArgs()) {
                System.out.print(arg+":");
                inArgs.add(choice.next());
            }

            chosenOpt.execute(inArgs);

        }


        //create game
        //create player
        //while game running
        //display game state
        //ask player to chose an option
        //player chooses an option
        //send option to game



    }
}
