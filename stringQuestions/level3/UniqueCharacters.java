import java.util.Scanner;

public class UniqueCharacters {

    // Method to find the length of a string without using the built-in length() method
    public static int findStringLength(String text) {
        int length = 0;
        while (true) {
            try {
                text.charAt(length); // Try accessing characters until it throws an exception
                length++;
            } catch (StringIndexOutOfBoundsException e) {
                break; // Stop when the exception is thrown (end of string)
            }
        }
        return length;
    }

    // Method to find unique characters in a string using charAt()
    public static char[] findUniqueCharacters(String text) {
        int length = findStringLength(text); // Get the length of the string
        char[] uniqueChars = new char[length]; // Array to store unique characters
        int uniqueIndex = 0; // Index to store unique characters in the result array

        // Outer loop to iterate through each character in the string
        for (int i = 0; i < length; i++) {
            char currentChar = text.charAt(i);
            boolean isUnique = true;

            // Inner loop to check if the current character is already in the uniqueChars array
            for (int j = 0; j < uniqueIndex; j++) {
                if (uniqueChars[j] == currentChar) {
                    isUnique = false; // If character is found in uniqueChars, it's not unique
                    break;
                }
            }

            // If the character is unique, add it to the uniqueChars array
            if (isUnique) {
                uniqueChars[uniqueIndex] = currentChar;
                uniqueIndex++;
            }
        }

        // Create a new array to store only the unique characters (without empty spaces)
        char[] result = new char[uniqueIndex];
        System.arraycopy(uniqueChars, 0, result, 0, uniqueIndex);
        return result;
    }

    // Method to display the unique characters
    public static void displayUniqueCharacters(char[] uniqueChars) {
        System.out.print("Unique characters: ");
        for (char c : uniqueChars) {
            System.out.print(c + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input for the string
        System.out.print("Enter a string: ");
        String text = scanner.nextLine();

        // Find unique characters in the string
        char[] uniqueChars = findUniqueCharacters(text);

        // Display the unique characters
        displayUniqueCharacters(uniqueChars);
    }
}
