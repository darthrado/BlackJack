package game_logic;

import org.junit.Test;

import static org.assertj.core.api.Assertions.*;


public class CardTest {
    @Test
    public void compareCardsPassing(){
        Card card1 = new Card(CardColor.CLUBS,CardRanks.ACE);
        Card card2 = new Card(CardColor.CLUBS,CardRanks.ACE);

        assertThat(card1.equals(card2)).isTrue();
    }

    @Test
    public void compareCardsPassing2(){
        Card card1 = new Card(CardColor.HEARTS,CardRanks.FOUR);
        Card card2 = new Card(CardColor.HEARTS,CardRanks.FOUR);

        assertThat(card1.equals(card2)).isTrue();
    }

    @Test
    public void compareCardsFailing(){
        Card card1 = new Card(CardColor.SPADES,CardRanks.JACK);
        Card card2 = new Card(CardColor.HEARTS,CardRanks.FOUR);

        assertThat(card1.equals(card2)).isFalse();
    }
    @Test
    public void compareCardsFailing2(){
        Card card1 = new Card(CardColor.CLUBS,CardRanks.EIGHT);
        Card card2 = new Card(CardColor.DIAMONDS,CardRanks.KING);

        assertThat(card1.equals(card2)).isFalse();
    }
    @Test
    public void compareCardsFailingSameColor(){
        Card card1 = new Card(CardColor.DIAMONDS,CardRanks.EIGHT);
        Card card2 = new Card(CardColor.DIAMONDS,CardRanks.KING);

        assertThat(card1.equals(card2)).isFalse();
    }
    @Test
    public void compareCardsFailingSameRank(){
        Card card1 = new Card(CardColor.CLUBS,CardRanks.EIGHT);
        Card card2 = new Card(CardColor.DIAMONDS,CardRanks.EIGHT);

        assertThat(card1.equals(card2)).isFalse();
    }

}