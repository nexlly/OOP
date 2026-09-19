package ru.nsu.blackjack;

/**
 * Масть карты.
 */
public enum Suit {
    SPADES("Пики"),
    HEARTS("Червы"),
    DIAMONDS("Бубны"),
    CLUBS("Трефы");

    private final String title;

    Suit(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
