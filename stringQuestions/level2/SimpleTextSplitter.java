import java.util.Scanner;

public class SimpleTextSplitter {

    // Method to manually calculate the length of a String without using the length() method
    public static int getLength(String word) {
        int length = 0;
        while (true) {
            try {
                word.charAt(length);  // Try accessing each character
                length++;  // Increment length
            } catch (StringIndexOutOfBoundsException e) {
                break;  // Reached end of string
            }
        }
        return length;
    }

    // Method to split text into words using charAt() without using split()
    public static String[] splitText(String text) {
        String[] words = new String[100]; // Maximum words are 100
        int wordCount = 0;
        StringBuilder word = new StringBuilder();
        
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) != ' ') {
                word.append(text.charAt(i));  // Build the word
            } else {
                if (word.length() > 0) {
                    words[wordCount++] = word.toString();  // Store the word
                    word.setLength(0);  // Reset the word builder
                }
            }
        }
        if (word.length() > 0) {
            words[wordCount++] = word.toString();  // Add last word if no space at the end
        }
        return words;
    }

    // Method to find the shortest and longest word lengths
    public static void findShortestAndLongest(String[] words) {
        int shortestLength = Integer.MAX_VALUE;
        int longestLength = Integer.MIN_VALUE;
        String shortestWord = "";
        String longestWord = "";
        
        for (int i = 0; i < words.length; i++) {
            if (words[i] == null) break;  // Stop when null values are encountered
            
            int length = getLength(words[i]);
            if (length < shortestLength) {
                shortestLength = length;
                shortestWord = words[i];
            }
            if (length > longestLength) {
                longestLength = length;
                longestWord = words[i];
            }
        }
        
        System.out.println("\nShortest word: " + shortestWord + " (Length: " + shortestLength + ")");
        System.out.println("Longest word: " + longestWord + " (Length: " + longestLength + ")");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input
        System.out.println("Enter a sentence: ");
        String inputText = scanner.nextLine();

        // Split text into words
        String[] words = splitText(inputText);

        // Find and display the shortest and longest words
        findShortestAndLongest(words);
    }
}
