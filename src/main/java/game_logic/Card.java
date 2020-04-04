package game_logic;

public class Card {
    private CardColor color;
    private CardRanks rank;

    public Card(CardColor color, CardRanks rank) {
        this.color = color;
        this.rank = rank;
    }

    public CardColor getColor() {
        return color;
    }

    public CardRanks getRank() {
        return rank;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;

        if (!(obj instanceof Card))
            return false;

        Card card = (Card)obj;

        return this.color == card.color && this.rank == card.rank;
    }
}
