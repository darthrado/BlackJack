package game_logic.commands;

public interface ICommand {
    int getNbMandatoryParams();
    void passParams(String[] args);
    void execute();
}
