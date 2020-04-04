package game_logic;

import org.junit.Test;
import java.util.List;
import static org.assertj.core.api.Assertions.*;

public class PlayerHandTest {
    @Test
    public void CheckIfHandIsMutable(){
        PlayerHand newPlayerHand = new PlayerHand();

        newPlayerHand.addCard(new Card(CardColor.DIAMONDS,CardRanks.JACK));
        newPlayerHand.addCard(new Card(CardColor.CLUBS,CardRanks.KING));

        List<Card> currentHand = newPlayerHand.getCardsInHand();

        assertThatExceptionOfType(UnsupportedOperationException.class).isThrownBy(() -> currentHand.remove(0));
    }
}