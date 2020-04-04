package game_logic;

import game_logic.game_states.IGameState;
import observer.IObservable;
import observer.IObserver;

public class GameObservable implements IObservable<IGameState> {
    @Override
    public void subscribe(IObserver newObserver) {

    }

    @Override
    public void unsubscribe(IObserver observer) {

    }

    @Override
    public void notifyObservers(IGameState event) {

    }
}
