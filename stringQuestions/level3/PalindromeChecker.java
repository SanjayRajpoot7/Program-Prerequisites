import java.util.Scanner;

public class PalindromeChecker {

    // Logic 1: Check if a string is a palindrome using iteration
    public static boolean isPalindromeIterative(String text) {
        int start = 0;
        int end = text.length() - 1;
        
        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false; // If characters are not equal, it's not a palindrome
            }
            start++;
            end--;
        }
        
        return true; // All characters matched, it's a palindrome
    }

    // Logic 2: Check if a string is a palindrome using recursion
    public static boolean isPalindromeRecursive(String text, int start, int end) {
        if (start >= end) {
            return true; // Base case: If start index is greater than or equal to end, it's a palindrome
        }
        
        if (text.charAt(start) != text.charAt(end)) {
            return false; // If characters don't match, it's not a palindrome
        }
        
        // Recursively check the next characters
        return isPalindromeRecursive(text, start + 1, end - 1);
    }

    // Logic 3: Check if a string is a palindrome by comparing original and reversed strings
    public static boolean isPalindromeUsingReverse(String text) {
        char[] originalArray = text.toCharArray(); // Convert string to character array
        char[] reverseArray = new char[originalArray.length]; // Array to store reversed string
        
        // Reverse the original array
        for (int i = 0; i < originalArray.length; i++) {
            reverseArray[i] = originalArray[originalArray.length - 1 - i];
        }

        // Compare the original array with the reversed array
        for (int i = 0; i < originalArray.length; i++) {
            if (originalArray[i] != reverseArray[i]) {
                return false; // If characters don't match, it's not a palindrome
            }
        }

        return true; // All characters matched, it's a palindrome
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input for the text
        System.out.print("Enter a text: ");
        String text = scanner.nextLine();

        // Remove spaces and convert to lowercase to handle cases like "A man a plan a canal Panama"
        String formattedText = text.replaceAll("\\s+", "").toLowerCase();

        // Check for palindrome using all three methods
        boolean result1 = isPalindromeIterative(formattedText);
        boolean result2 = isPalindromeRecursive(formattedText, 0, formattedText.length() - 1);
        boolean result3 = isPalindromeUsingReverse(formattedText);

        // Display the results
        System.out.println("Palindrome check using iteration: " + result1);
        System.out.println("Palindrome check using recursion: " + result2);
        System.out.println("Palindrome check using string reversal: " + result3);
    }
}
