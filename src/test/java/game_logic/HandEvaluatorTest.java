package game_logic;

import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class HandEvaluatorTest {
    @Test
    public void TestHandStrengthJackTen(){
        PlayerHand toTest = new PlayerHand();
        toTest.addCard(new Card(CardColor.CLUBS,CardRanks.JACK));
        toTest.addCard(new Card(CardColor.DIAMONDS,CardRanks.TEN));

        assertThat(HandEvaluator.getHandStrength(toTest)).isEqualTo(20);
    }
    @Test
    public void TestHandStrengthJackTenFive(){
        PlayerHand toTest = new PlayerHand();
        toTest.addCard(new Card(CardColor.CLUBS,CardRanks.JACK));
        toTest.addCard(new Card(CardColor.DIAMONDS,CardRanks.TEN));
        toTest.addCard(new Card(CardColor.HEARTS,CardRanks.FIVE));

        assertThat(HandEvaluator.getHandStrength(toTest)).isEqualTo(25);
    }
    @Test
    public void TestHandStrengthAceSix(){
        PlayerHand toTest = new PlayerHand();
        toTest.addCard(new Card(CardColor.CLUBS,CardRanks.ACE));
        toTest.addCard(new Card(CardColor.DIAMONDS,CardRanks.SIX));

        assertThat(HandEvaluator.getHandStrength(toTest)).isEqualTo(17);
    }
    @Test
    public void TestHandStrengthAceTenTrey(){
        PlayerHand toTest = new PlayerHand();
        toTest.addCard(new Card(CardColor.CLUBS,CardRanks.ACE));
        toTest.addCard(new Card(CardColor.DIAMONDS,CardRanks.TEN));
        toTest.addCard(new Card(CardColor.CLUBS,CardRanks.TREY));

        assertThat(HandEvaluator.getHandStrength(toTest)).isEqualTo(14);
    }
    @Test
    public void TestHandStrengthAceJack(){
        PlayerHand toTest = new PlayerHand();
        toTest.addCard(new Card(CardColor.CLUBS,CardRanks.JACK));
        toTest.addCard(new Card(CardColor.DIAMONDS,CardRanks.ACE));

        assertThat(HandEvaluator.getHandStrength(toTest)).isEqualTo(21);
    }

    @Test
    public void TestHandStrengthAceAceTen(){
        PlayerHand toTest = new PlayerHand();
        toTest.addCard(new Card(CardColor.CLUBS,CardRanks.ACE));
        toTest.addCard(new Card(CardColor.DIAMONDS,CardRanks.ACE));
        toTest.addCard(new Card(CardColor.DIAMONDS,CardRanks.TEN));

        assertThat(HandEvaluator.getHandStrength(toTest)).isEqualTo(12);
    }
    @Test
    public void TestHandStrengthAceAceSeven(){
        PlayerHand toTest = new PlayerHand();
        toTest.addCard(new Card(CardColor.CLUBS,CardRanks.ACE));
        toTest.addCard(new Card(CardColor.SPADES,CardRanks.ACE));
        toTest.addCard(new Card(CardColor.DIAMONDS,CardRanks.SEVEN));

        assertThat(HandEvaluator.getHandStrength(toTest)).isEqualTo(19);
    }

    @Test
    public void TestHandStrengthAceAceQueenKing(){
        PlayerHand toTest = new PlayerHand();
        toTest.addCard(new Card(CardColor.CLUBS,CardRanks.ACE));
        toTest.addCard(new Card(CardColor.SPADES,CardRanks.ACE));
        toTest.addCard(new Card(CardColor.HEARTS,CardRanks.QUEEN));
        toTest.addCard(new Card(CardColor.DIAMONDS,CardRanks.KING));

        assertThat(HandEvaluator.getHandStrength(toTest)).isEqualTo(22);
    }

}