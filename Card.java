// Card.java
class Card {
    String rank;
    String suit;

    // Constructor to initialize a card
    public Card(String rank, String suit) {
        this.rank = rank;
        this.suit = suit;
    }

    // Convert card to string representation
    public String toString() {
        return rank + " of " + suit;
    }
}

