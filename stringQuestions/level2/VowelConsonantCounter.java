import java.util.Scanner;

public class VowelConsonantCounter {

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

    // Method to count vowels and consonants in a string
    public static int[] countVowelsAndConsonants(String text) {
        int vowelCount = 0;
        int consonantCount = 0;

        // Iterate through each character of the string
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            // Check if the character is a vowel or consonant
            if (checkCharacter(ch).equals("Vowel")) {
                vowelCount++;
            } else if (checkCharacter(ch).equals("Consonant")) {
                consonantCount++;
            }
        }

        // Return the count as an array, where index 0 holds vowels count and index 1 holds consonants count
        return new int[] { vowelCount, consonantCount };
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input
        System.out.println("Enter a string: ");
        String inputText = scanner.nextLine();

        // Get the counts of vowels and consonants
        int[] counts = countVowelsAndConsonants(inputText);

        // Display the results
        System.out.println("Vowels count: " + counts[0]);
        System.out.println("Consonants count: " + counts[1]);
    }
}
