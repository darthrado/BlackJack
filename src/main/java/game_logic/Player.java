package game_logic;

import java.rmi.server.UID;

public class Player {
    private UID playerID;
    private double money;

    public Player(UID playerID, double money) {
        this.playerID = playerID;
        this.money = money;
    }

    public UID getPlayerID() {
        return playerID;
    }

    public double getMoney() {
        return money;
    }

    public boolean take(double amount){
        if (amount<=money){
            money-=amount;
            return true;
        }
        return false;
    }

    public void give(double amount){
        money+=amount;
    }
}
