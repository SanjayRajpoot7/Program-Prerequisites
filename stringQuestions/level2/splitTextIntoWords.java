import java.util.Scanner;

public class splitTextIntoWords {

    // Method to find the length of the String without using the built-in length() method
    public static int getLength(String text) {
        int length = 0;
        while (true) {
            try {
                text.charAt(length);
                length++;
            } catch (StringIndexOutOfBoundsException e) {
                break;
            }
        }
        return length;
    }

    // Method to split the text into words using charAt() without using String built-in split()
    public static String[] splitTextWithoutSplitMethod(String text) {
        // First, count the number of words by counting spaces
        int wordCount = 1; // At least one word is present
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }

        // Create an array to store the indexes of spaces for each word
        int[] spaceIndexes = new int[wordCount - 1];
        int spaceCount = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
                spaceIndexes[spaceCount++] = i;
            }
        }

        // Create an array to store the words
        String[] words = new String[wordCount];
        int startIndex = 0;
        int wordIndex = 0;

        for (int i = 0; i < spaceIndexes.length; i++) {
            words[wordIndex++] = text.substring(startIndex, spaceIndexes[i]);
            startIndex = spaceIndexes[i] + 1; // Skip the space
        }
        words[wordIndex] = text.substring(startIndex); // The last word

        return words;
    }

    // Method to compare the two String arrays (user-defined and built-in split()) and return a boolean
    public static boolean compareWordArrays(String[] userDefinedSplit, String[] builtInSplit) {
        if (userDefinedSplit.length != builtInSplit.length) {
            return false;
        }

        for (int i = 0; i < userDefinedSplit.length; i++) {
            if (!userDefinedSplit[i].equals(builtInSplit[i])) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String inputText = scanner.nextLine();

        // Use the user-defined method to split the text
        String[] userDefinedWords = splitTextWithoutSplitMethod(inputText);

        // Use the built-in split() method to split the text
        String[] builtInWords = inputText.split(" ");

        // Compare the two arrays and display the result
        boolean isEqual = compareWordArrays(userDefinedWords, builtInWords);

        System.out.println("User-defined split words: ");
        for (String word : userDefinedWords) {
            System.out.println(word);
        }

        System.out.println("Built-in split words: ");
        for (String word : builtInWords) {
            System.out.println(word);
        }

        System.out.println("\nDo the user-defined and built-in split results match? " + isEqual);
    }
}
