import java.util.Scanner;

public class SubstringComparison {

    // Method to create a substring using charAt() method
    public static String createSubstringUsingCharAt(String text, int start, int end) {
        StringBuilder substring = new StringBuilder();
        for (int i = start; i < end; i++) {
            substring.append(text.charAt(i)); // Append each character from start to end index
        }
        return substring.toString();
    }

    // Method to compare two strings
    public static boolean compareStrings(String str1, String str2) {
        return str1.equals(str2); // Compare the two strings using equals() method
    }

    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        // Get user input for the original string and the start and end indices
        System.out.print("Enter a string: ");
        String text = scanner.next();
        
        System.out.print("Enter the start index: ");
        int start = scanner.nextInt();
        
        System.out.print("Enter the end index: ");
        int end = scanner.nextInt();
        
        // Get the substring using the charAt() method
        String substringUsingCharAt = createSubstringUsingCharAt(text, start, end);
        
        // Get the substring using the built-in substring() method
        String substringUsingBuiltIn = text.substring(start, end);
        
        // Compare the two substrings
        boolean areEqual = compareStrings(substringUsingCharAt, substringUsingBuiltIn);
        
        // Display the results
        System.out.println("Substring using charAt(): " + substringUsingCharAt);
        System.out.println("Substring using built-in substring(): " + substringUsingBuiltIn);
        System.out.println("Are the two substrings equal? " + areEqual);
        
        // Close the scanner to prevent resource leak
        scanner.close();
    }
}
