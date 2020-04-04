package game_logic.game_states;

public interface IGameState {
    boolean checkIfCanAdvance();
    IGameState advanceGameState();
}
