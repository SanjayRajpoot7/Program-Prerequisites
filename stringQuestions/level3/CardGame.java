import java.util.*;

public class CardGame {
    
    // Method to initialize the deck of cards with suits and ranks
    public static String[] initializeDeck() {
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        
        // Calculate the number of cards in the deck
        int numOfCards = suits.length * ranks.length;
        
        String[] deck = new String[numOfCards];
        int index = 0;
        
        // Initialize the deck with "rank of suit"
        for (String suit : suits) {
            for (String rank : ranks) {
                deck[index] = rank + " of " + suit;
                index++;
            }
        }
        
        return deck;
    }

    // Method to shuffle the deck of cards
    public static String[] shuffleDeck(String[] deck) {
        Random rand = new Random();
        
        // Shuffle the deck using the Fisher-Yates shuffle algorithm
        for (int i = 0; i < deck.length; i++) {
            int randomIndex = i + rand.nextInt(deck.length - i);
            // Swap the current card with the random card
            String temp = deck[i];
            deck[i] = deck[randomIndex];
            deck[randomIndex] = temp;
        }
        
        return deck;
    }

    // Method to distribute cards to players
    public static String[][] distributeCards(String[] deck, int numOfCards, int numOfPlayers) {
        if (numOfCards % numOfPlayers != 0) {
            System.out.println("Cannot distribute the cards equally!");
            return new String[0][0];
        }
        
        // Create a 2D array to store players and their cards
        String[][] players = new String[numOfPlayers][numOfCards / numOfPlayers];
        
        int cardIndex = 0;
        for (int i = 0; i < numOfPlayers; i++) {
            for (int j = 0; j < numOfCards / numOfPlayers; j++) {
                players[i][j] = deck[cardIndex++];
            }
        }
        
        return players;
    }

    // Method to print the players and their cards
    public static void printPlayersCards(String[][] players) {
        for (int i = 0; i < players.length; i++) {
            System.out.print("Player " + (i + 1) + ": ");
            for (int j = 0; j < players[i].length; j++) {
                System.out.print(players[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Initialize the deck
        String[] deck = initializeDeck();
        
        // Shuffle the deck
        deck = shuffleDeck(deck);
        
        // Take input for the number of players and number of cards per player
        System.out.print("Enter the number of players: ");
        int numOfPlayers = scanner.nextInt();
        
        System.out.print("Enter the number of cards to distribute to each player: ");
        int numOfCards = scanner.nextInt();
        
        // Distribute the cards
        String[][] playersCards = distributeCards(deck, numOfCards * numOfPlayers, numOfPlayers);
        
        // Print the cards of each player
        if (playersCards.length > 0) {
            printPlayersCards(playersCards);
        }
        
        scanner.close();
    }
}
