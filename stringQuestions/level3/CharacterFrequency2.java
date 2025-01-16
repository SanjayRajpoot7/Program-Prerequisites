import java.util.Scanner;

public class CharacterFrequency2 {

    // Method to find the frequency of characters in the string
    public static String[][] findCharacterFrequency(String text) {
        int length = text.length();
        int[] frequency = new int[256];  // Array to store the frequency of each character (ASCII values)

        // Loop through the string to calculate the frequency of each character
        for (int i = 0; i < length; i++) {
            char currentChar = text.charAt(i);
            frequency[currentChar]++;  // Increment the frequency of the current character
        }

        // Loop through the frequency array to find unique characters and their frequencies
        // Count how many unique characters are present
        int uniqueCount = 0;
        for (int i = 0; i < 256; i++) {
            if (frequency[i] > 0) {
                uniqueCount++;
            }
        }

        // Create a 2D array to store the characters and their frequencies
        String[][] result = new String[uniqueCount][2];
        int index = 0;

        // Loop again to populate the result array with unique characters and their frequencies
        for (int i = 0; i < 256; i++) {
            if (frequency[i] > 0) {
                result[index][0] = String.valueOf((char) i);  // Store the character
                result[index][1] = String.valueOf(frequency[i]);  // Store the frequency
                index++;
            }
        }

        // Return the 2D array containing characters and their frequencies
        return result;
    }

    // Method to display the frequency of characters in a tabular format
    public static void displayCharacterFrequency(String[][] frequencyData) {
        System.out.println("Character\tFrequency");
        System.out.println("--------------------------");

        // Loop through the 2D array and print each character and its frequency
        for (int i = 0; i < frequencyData.length; i++) {
            System.out.println(frequencyData[i][0] + "\t\t" + frequencyData[i][1]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input for the string
        System.out.print("Enter a string: ");
        String text = scanner.nextLine();

        // Find the frequency of characters
        String[][] frequencyData = findCharacterFrequency(text);

        // Display the result
        displayCharacterFrequency(frequencyData);
    }
}
