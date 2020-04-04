package game_logic.custom_rules;

import game_logic.game_states.IGameState;

public interface IRule {
    boolean checkIfApply(IGameState currentGameState);
}
