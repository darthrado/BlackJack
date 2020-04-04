package game_logic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PlayerHand {
    private  List<Card> cardsInHand;

    public PlayerHand() {
        cardsInHand = new ArrayList<>();
    }

    public void addCard(Card newCard){
        cardsInHand.add(newCard);
    }

    public boolean removeCard(Card cardToBeRemoved){
        return cardsInHand.remove(cardToBeRemoved);
    }

    public List<Card> getCardsInHand() throws UnsupportedOperationException{
        return Collections.unmodifiableList(cardsInHand);
    }
}
