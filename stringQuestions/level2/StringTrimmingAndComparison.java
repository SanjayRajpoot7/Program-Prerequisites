import java.util.Scanner;

public class StringTrimmingAndComparison {

    // Method to find the starting and ending indices of the string without leading or trailing spaces
    public static int[] trimSpaces(String text) {
        int start = 0;
        int end = text.length() - 1;

        // Trim leading spaces
        while (start <= end && text.charAt(start) == ' ') {
            start++;
        }

        // Trim trailing spaces
        while (end >= start && text.charAt(end) == ' ') {
            end--;
        }

        return new int[]{start, end}; // Return the start and end indices
    }

    // Method to create a substring using charAt() with start and end index
    public static String substringUsingCharAt(String text, int start, int end) {
        StringBuilder result = new StringBuilder();
        for (int i = start; i <= end; i++) {
            result.append(text.charAt(i)); // Build the substring
        }
        return result.toString();
    }

    // Method to compare two strings using the charAt() method
    public static boolean compareStringsUsingCharAt(String str1, String str2) {
        // If lengths are different, they are not equal
        if (str1.length() != str2.length()) {
            return false;
        }

        // Compare each character
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }

        return true; // Strings are equal if all characters match
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input
        System.out.println("Enter a string with leading and trailing spaces: ");
        String inputText = scanner.nextLine();

        // Trim the spaces manually using charAt() method
        int[] trimIndices = trimSpaces(inputText);
        String manuallyTrimmedString = substringUsingCharAt(inputText, trimIndices[0], trimIndices[1]);

        // Trim spaces using built-in trim() method
        String builtInTrimmedString = inputText.trim();

        // Compare both trimmed strings
        boolean areStringsEqual = compareStringsUsingCharAt(manuallyTrimmedString, builtInTrimmedString);

        // Display the result
        System.out.println("\nManually trimmed string: '" + manuallyTrimmedString + "'");
        System.out.println("Built-in trimmed string: '" + builtInTrimmedString + "'");
        System.out.println("Are both trimmed strings equal? " + areStringsEqual);
    }
}
