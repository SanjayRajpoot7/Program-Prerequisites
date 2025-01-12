import java.util.Arrays;

public class NumberCheckerCountDigit {

    // Method to find the count of digits in the number
    public static int countDigits(int number) {
        return Integer.toString(number).length();
    }

    // Method to store the digits of the number in a digits array
    public static int[] storeDigits(int number) {
        int digitCount = countDigits(number);
        int[] digits = new int[digitCount];
        for (int i = digitCount - 1; i >= 0; i--) {
            digits[i] = number % 10;
            number = number / 10;
        }
        return digits;
    }

    // Method to reverse the digits array
    public static int[] reverseArray(int[] digits) {
        int[] reversed = new int[digits.length];
        for (int i = 0; i < digits.length; i++) {
            reversed[i] = digits[digits.length - 1 - i];
        }
        return reversed;
    }

    // Method to compare two arrays and check if they are equal
    public static boolean areArraysEqual(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }

    // Method to check if a number is a palindrome using the digits array
    public static boolean isPalindrome(int number) {
        int[] digits = storeDigits(number);
        int[] reversedDigits = reverseArray(digits);
        return areArraysEqual(digits, reversedDigits);
    }

    // Method to check if a number is a Duck number using the digits array
    public static boolean isDuckNumber(int number) {
        int[] digits = storeDigits(number);
        // A Duck number must contain at least one non-zero digit and not start with zero
        if (digits[0] == 0) {
            for (int digit : digits) {
                if (digit != 0) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int number = 12021; // Example number, you can change it as needed

        // Store digits of the number
        int[] digits = storeDigits(number);

        // Count digits
        int digitCount = countDigits(number);
        System.out.println("Number of digits: " + digitCount);

        // Check if the number is a palindrome
        boolean isPalindrome = isPalindrome(number);
        System.out.println("Is Palindrome? " + isPalindrome);

        // Check if the number is a Duck number
        boolean isDuckNumber = isDuckNumber(number);
        System.out.println("Is Duck Number? " + isDuckNumber);

        // Reverse the digits array
        int[] reversedDigits = reverseArray(digits);
        System.out.println("Reversed Digits: " + Arrays.toString(reversedDigits));

        // Compare the original digits and reversed digits
        boolean areEqual = areArraysEqual(digits, reversedDigits);
        System.out.println("Are original digits equal to reversed digits? " + areEqual);
    }
}
