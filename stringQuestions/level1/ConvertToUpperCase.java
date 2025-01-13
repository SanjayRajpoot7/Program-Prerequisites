import java.util.Scanner;

public class ConvertToUpperCase {

    // Method to convert the string to uppercase using charAt()
    public static String convertToUpperCaseUsingCharAt(String text) {
        StringBuilder upperCaseText = new StringBuilder(); // StringBuilder to store the result
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i); // Get the character at index i
            
            // Check if the character is lowercase, and convert it to uppercase
            if (ch >= 'a' && ch <= 'z') {
                // Convert the character to uppercase by subtracting 32 from its ASCII value
                ch = (char) (ch - 32);
            }
            upperCaseText.append(ch); // Append the character to the StringBuilder
        }
        return upperCaseText.toString(); // Return the result as a string
    }

    // Method to compare two strings
    public static boolean compareStrings(String str1, String str2) {
        return str1.equals(str2); // Compare the strings and return whether they are equal
    }

    public static void main(String[] args) {
        // Create Scanner object to take input from user
        Scanner scanner = new Scanner(System.in);

        // Take the input string
        System.out.print("Enter a text: ");
        String text = scanner.nextLine(); // Read the complete text

        // Convert the text to uppercase using the user-defined method
        String convertedTextUsingCharAt = convertToUpperCaseUsingCharAt(text);
        
        // Convert the text to uppercase using the built-in method
        String convertedTextUsingBuiltIn = text.toUpperCase();

        // Compare the two strings
        boolean areStringsEqual = compareStrings(convertedTextUsingCharAt, convertedTextUsingBuiltIn);

        // Display the results
        System.out.println("Original Text: " + text);
        System.out.println("Converted using charAt method: " + convertedTextUsingCharAt);
        System.out.println("Converted using built-in toUpperCase method: " + convertedTextUsingBuiltIn);
        System.out.println("Are both methods' results equal? " + (areStringsEqual ? "Yes" : "No"));

        // Close the scanner to avoid resource leak
        scanner.close();
    }
}
