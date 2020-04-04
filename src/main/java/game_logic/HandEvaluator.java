package game_logic;

import java.util.HashMap;
import java.util.Map;

public class HandEvaluator {
    private static final Map<CardRanks,Integer> nonAceValues = buildNonAceValues();

    private static final int BUST_VALUE = 21;
    private static final int ACE_HIGH_ADD = 10;

    private static Map<CardRanks,Integer> buildNonAceValues(){
        Map<CardRanks,Integer> out = new HashMap<>();
        out.put(CardRanks.ACE,1);
        out.put(CardRanks.DEUCE,2);
        out.put(CardRanks.TREY,3);
        out.put(CardRanks.FOUR,4);
        out.put(CardRanks.FIVE,5);
        out.put(CardRanks.SIX,6);
        out.put(CardRanks.SEVEN,7);
        out.put(CardRanks.EIGHT,8);
        out.put(CardRanks.NINE,9);
        out.put(CardRanks.TEN,10);
        out.put(CardRanks.JACK,10);
        out.put(CardRanks.QUEEN,10);
        out.put(CardRanks.KING,10);

        return out;
    }

    public static int getHandStrength(PlayerHand playerHand){
        int nbOfAces = getNbOfAces(playerHand);
        int value = getValues(playerHand);

        if (nbOfAces>0 && value+ACE_HIGH_ADD<=BUST_VALUE)
            return value+ACE_HIGH_ADD;
        else
            return value;
    }

    private static int getNonAceCardValue(Card card){
        return nonAceValues.get(card.getRank());
    }

    private static int getNbOfAces(PlayerHand playerHand){
        return (int)playerHand.getCardsInHand()
                .stream()
                .filter(f -> f.getRank() == CardRanks.ACE)
                .count();
    }
    private static int getValues(PlayerHand playerHand){
        return playerHand.getCardsInHand()
                .stream()
                .mapToInt((HandEvaluator::getNonAceCardValue)).sum();
    }
}
