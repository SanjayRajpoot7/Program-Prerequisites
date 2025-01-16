import java.util.Scanner;

public class TextSplitterWithLength {

    // Method to find the length of a String without using the built-in length() method
    public static int getLength(String text) {
        int length = 0;
        try {
            while (true) {
                text.charAt(length); // Try accessing each character
                length++; // Increment length for each character
            }
        } catch (StringIndexOutOfBoundsException e) {
            // When the exception is thrown, we reached the end of the string
        }
        return length;
    }

    // Method to split the text into words using charAt() without using the String built-in split() method
    public static String[] splitTextWithoutSplitMethod(String text) {
        int wordCount = 1; // At least one word is there
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
                wordCount++; // Count spaces to determine word count
            }
        }

        // Array to store the words
        String[] words = new String[wordCount];
        StringBuilder word = new StringBuilder();
        int wordIndex = 0;

        // Loop through the text to extract words
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) != ' ') {
                word.append(text.charAt(i)); // Build the word
            } else if (word.length() > 0) {
                words[wordIndex++] = word.toString(); // Save the word
                word.setLength(0); // Reset the word builder
            }
        }

        // Add the last word if the string ends without a space
        if (word.length() > 0) {
            words[wordIndex] = word.toString();
        }

        return words;
    }

    // Method to return a 2D array with words and their lengths
    public static String[][] getWordsWithLength(String[] words) {
        String[][] wordWithLength = new String[words.length][2]; // 2D array to hold word and length

        for (int i = 0; i < words.length; i++) {
            wordWithLength[i][0] = words[i]; // Word
            wordWithLength[i][1] = String.valueOf(getLength(words[i])); // Length as String
        }

        return wordWithLength;
    }

    // Main method to execute the program
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input
        System.out.println("Enter a sentence: ");
        String inputText = scanner.nextLine();

        // Split text into words using the custom split method
        String[] words = splitTextWithoutSplitMethod(inputText);

        // Get words with their lengths in a 2D array
        String[][] wordsWithLengths = getWordsWithLength(words);

        // Display the words and their lengths in tabular format
        System.out.println("\nWord\t\tLength");
        System.out.println("----------------------");
        for (int i = 0; i < wordsWithLengths.length; i++) {
            System.out.println(wordsWithLengths[i][0] + "\t\t" + Integer.parseInt(wordsWithLengths[i][1]));
        }
    }
}
