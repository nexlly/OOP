package ru.nsu.blackjack;

import java.util.Objects;

public final class Card {
    private final Rank rank;
    private final Suit suit;

    public Card(Rank rank, Suit suit) {
        this.rank = Objects.requireNonNull(rank);
        this.suit = Objects.requireNonNull(suit);
    }

    public Rank getRank() {
        return rank;
    }

    public Suit getSuit() {
        return suit;
    }

    public String getName() {
        return rank.getTitle() + " " + suit.getTitle();
    }

    public String format(int value) {
        return getName() + " (" + value + ")";
    }

    @Override
    public String toString() {
        return format(rank.getValue());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return  true;
        }
        if (!(o instanceof Card)) {
            return false;
        }
        Card card = (Card) o;
        return rank == card.rank && suit == card.suit;
    }

    @Override
    public int hashCode() {
        return Objects.hash(rank, suit);
    }
}
