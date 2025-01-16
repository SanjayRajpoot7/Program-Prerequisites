import java.util.Scanner;

public class AnagramChecker {

    // Method to check if two texts are anagrams
    public static boolean areAnagrams(String text1, String text2) {
        // Check if the lengths of the two texts are equal
        if (text1.length() != text2.length()) {
            return false;
        }

        int[] frequency1 = new int[256]; // Frequency array for the first text
        int[] frequency2 = new int[256]; // Frequency array for the second text

        // Count the frequency of characters in both strings
        for (int i = 0; i < text1.length(); i++) {
            frequency1[text1.charAt(i)]++; // Increment frequency for text1
            frequency2[text2.charAt(i)]++; // Increment frequency for text2
        }

        // Compare the frequency arrays
        for (int i = 0; i < 256; i++) {
            if (frequency1[i] != frequency2[i]) {
                return false; // If frequencies don't match, the texts are not anagrams
            }
        }

        return true;     }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input for two texts
        System.out.print("Enter the first text: ");
        String text1 = scanner.nextLine();

        System.out.print("Enter the second text: ");
        String text2 = scanner.nextLine();

        // Call the areAnagrams method and display the result
        boolean result = areAnagrams(text1, text2);

        if (result) {
            System.out.println("The texts are anagrams.");
        } else {
            System.out.println("The texts are not anagrams.");
        }
    }
}
