package game_logic.game_states;

public class InitialState implements IGameState {
    @Override
    public boolean checkIfCanAdvance() {
        return false;
    }

    @Override
    public IGameState advanceGameState() {
        return null;
    }
}
