import java.util.Scanner;

public class CharacterFrequency3 {

    // Method to find the frequency of characters in a string using nested loops
    public static String[] findCharacterFrequency(String text) {
        char[] characters = text.toCharArray();  // Convert string to character array
        int length = characters.length;
        String[] result = new String[length];  // Array to store characters and their frequencies
        boolean[] visited = new boolean[length]; // Array to track visited characters

        // Outer loop to iterate through each character in the string
        for (int i = 0; i < length; i++) {
            // Skip the character if it has already been counted
            if (visited[i]) {
                continue;
            }

            char currentChar = characters[i];
            int frequency = 1;  // Initialize the frequency of the character

            // Inner loop to check for duplicates and count frequency
            for (int j = i + 1; j < length; j++) {
                if (characters[j] == currentChar) {
                    frequency++; // Increment frequency if a duplicate is found
                    visited[j] = true; // Mark this character as visited
                }
            }

            // Store the character and its frequency in the result array
            result[i] = currentChar + ": " + frequency;
        }

        return result;
    }

    // Method to display the frequency of characters in the string
    public static void displayCharacterFrequency(String[] frequencyData) {
        System.out.println("Character Frequency:");
        System.out.println("---------------------");

        // Loop through the result array and print the character and its frequency
        for (String data : frequencyData) {
            if (data != null) {  // Avoid printing null values
                System.out.println(data);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input for the string
        System.out.print("Enter a string: ");
        String text = scanner.nextLine();

        // Find the frequency of characters
        String[] frequencyData = findCharacterFrequency(text);

        // Display the result
        displayCharacterFrequency(frequencyData);
    }
}
