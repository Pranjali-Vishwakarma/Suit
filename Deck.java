// Deck.java
import java.util.Collections;
import java.util.ArrayList;

class Deck {
    ArrayList<Card> deck;

    // Constructor to initialize the deck
    public Deck() {
        deck = new ArrayList<>();
        createDeck();
    }

    // Method to create a deck of 52 cards
    public void createDeck() {
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        String[] suits = {"Hearts", "Clubs", "Diamonds", "Spades"};

        for (String suit : suits) {
            for (String rank : ranks) {
                deck.add(new Card(rank, suit));
            }
        }
    }

    // Method to display all cards in the deck
    public void displayDeck() {
        for (Card card : deck) {
            System.out.println(card);
        }
    }

    // Method to shuffle the deck
    public void shuffleDeck() {
        Collections.shuffle(deck);
        System.out.println("Deck shuffled successfully.");
    }

    // Method to print 2 random cards from the deck
    public void randomCards() {
        if (deck.size() < 2) {
            System.out.println("Not enough cards to display.");
            return;
        }
        Collections.shuffle(deck);
        System.out.println("Random Card 1: " + deck.get(0));
        System.out.println("Random Card 2: " + deck.get(1));
    }

    // Method to find a specific card in the deck
    public void findCard(String rank, String suit) {
        for (Card card : deck) {
            if (card.rank.equalsIgnoreCase(rank) && card.suit.equalsIgnoreCase(suit)) {
                System.out.println("Card Found: " + card);
                return;
            }
        }
        System.out.println("Card not found in the deck.");
    }

    // Method to deal 5 random cards
    public void dealCard() {
        if (deck.size() < 5) {
            System.out.println("Not enough cards to deal.");
            return;
        }
        System.out.println("Dealing 5 random cards:");
        Collections.shuffle(deck);
        for (int i = 0; i < 5; i++) {
            System.out.println(deck.get(i));
        }
    }

    // Method to distribute 5 random cards to 3 players
    public void cardPlayers() {
        if (deck.size() < 15) {
            System.out.println("Not enough cards to distribute to 3 players.");
            return;
        }
        Collections.shuffle(deck);
        System.out.println("\nDistributing 5 random cards to 3 players:");
        for (int i = 1; i <= 3; i++) {
            System.out.println("Player " + i + ":");
            for (int j = 0; j < 5; j++) {
                System.out.println(deck.get(i * 5 + j));
            }
            System.out.println();
        }
    }
}
