import java.util.Scanner;

public class CharacterTypeCounter {

    // Method to check if the character is a vowel, consonant, or not a letter
    public static String checkCharacter(char ch) {
        // Convert the character to lowercase
        ch = Character.toLowerCase(ch);

        // Check if the character is a vowel
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            return "Vowel";
        }
        // Check if the character is a consonant (it should be a letter and not a vowel)
        else if (ch >= 'a' && ch <= 'z') {
            return "Consonant";
        } else {
            return "Not a Letter";  // Return "Not a Letter" if it's not an alphabet character
        }
    }

    // Method to find vowels and consonants in a string and return the result in a 2D array
    public static String[][] findCharacterTypes(String text) {
        // Initialize a 2D array with rows equal to the length of the input string
        String[][] result = new String[text.length()][2];

        // Loop through each character of the string
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            result[i][0] = String.valueOf(ch);  // Store the character
            result[i][1] = checkCharacter(ch); // Store whether it's a Vowel, Consonant, or Not a Letter
        }

        return result;  // Return the 2D array containing the character types
    }

    // Method to display the 2D array in tabular format
    public static void displayTable(String[][] data) {
        System.out.println("\nCharacter\tType");
        System.out.println("--------------------------");
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i][0] + "\t\t" + data[i][1]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input
        System.out.println("Enter a string: ");
        String inputText = scanner.nextLine();

        // Get the 2D array of character types
        String[][] characterTypes = findCharacterTypes(inputText);

        // Display the character types in tabular format
        displayTable(characterTypes);
    }
}
