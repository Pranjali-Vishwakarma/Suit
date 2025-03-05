// Main.java
import java.util.Scanner;

/*
 * Name: Pranjali Vishwakarma
 * PRN: 23070126092
 * Batch: SY AIML B1
 *
 * This is a menu-driven Java program to perform various operations on a deck of cards.
 */

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Deck deck = new Deck();

        while (true) {
            System.out.println("\n--- Card Deck Menu ---");
            System.out.println("1. Print Deck");
            System.out.println("2. Shuffle Deck");
            System.out.println("3. Deal 5 Random Cards");
            System.out.println("4. Find a Card");
            System.out.println("5. Print 2 Random Cards");
            System.out.println("6. Distribute Cards to 3 Players");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline

            switch (choice) {
                case 1:
                    System.out.println("\n--- Printing Deck ---");
                    deck.displayDeck();
                    break;
                case 2:
                    System.out.println("\n--- Shuffling Deck ---");
                    deck.shuffleDeck();
                    break;
                case 3:
                    System.out.println("\n--- Dealing 5 Random Cards ---");
                    deck.dealCard();
                    break;
                case 4:
                    System.out.print("Enter Rank (e.g., Ace, 2, 3, Jack): ");
                    String rank = scanner.nextLine();
                    System.out.print("Enter Suit (Hearts, Diamonds, Clubs, Spades): ");
                    String suit = scanner.nextLine();
                    deck.findCard(rank, suit);
                    break;
                case 5:
                    System.out.println("\n--- Printing 2 Random Cards ---");
                    deck.randomCards();
                    break;
                case 6:
                    System.out.println("\n--- Distributing Cards to 3 Players ---");
                    deck.cardPlayers();
                    break;
                case 7:
                    System.out.println("Exiting the program. Thank you!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}
