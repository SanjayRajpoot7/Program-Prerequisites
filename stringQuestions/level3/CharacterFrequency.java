import java.util.Scanner;

public class CharacterFrequency {

    
    public static String[][] findCharacterFrequency(String text) {
        
        int[] frequency = new int[256];

        // Loop through the string to find the frequency of each character
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            frequency[currentChar]++;  // Increment the count for the current character
        }

        // Create a 2D array to store the characters and their frequencies
           String[][] result = new String[256][2];
        int index = 0;

        // Loop through the frequency array and store the character and its frequency
        for (int i = 0; i < 256; i++) {
            if (frequency[i] > 0) {
                result[index][0] = String.valueOf((char) i);  // Store the character
                result[index][1] = String.valueOf(frequency[i]);  // Store the frequency
                index++;
            }
        }

        // Return the 2D array with the characters and their frequencies
        return result;
    }

    // Method to display the frequency of characters in a tabular format
    public static void displayCharacterFrequency(String[][] frequencyData) {
        System.out.println("Character\tFrequency");
       

        // Loop through the 2D array and print the character and its frequency
        for (int i = 0; i < frequencyData.length; i++) {
            if (frequencyData[i][0] != null) { // Check if the entry is not null
                System.out.println(frequencyData[i][0] + "\t\t" + frequencyData[i][1]);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input for the string
        System.out.print("Enter a string: ");
        String text = scanner.nextLine();

       
        String[][] frequencyData = findCharacterFrequency(text);

      
        displayCharacterFrequency(frequencyData);
    }
}
