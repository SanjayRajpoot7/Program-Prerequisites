import java.util.Scanner;

public class NumberChecker {

    // Method to check if a number is positive or negative
    public static String isPositive(int number) {
        if (number < 0) {
            return "Negative";
        } else {
            return "Positive";
        }
    }

    // Method to check if a number is even or odd
    public static String isEven(int number) {
        if (number % 2 == 0) {
            return "Even";
        } else {
            return "Odd";
        }
    }

    // Method to compare two numbers
    public static int compare(int number1, int number2) {
        if (number1 > number2) {
            return 1;  // number1 is greater
        } else if (number1 == number2) {
            return 0;  // numbers are equal
        } else {
            return -1; // number1 is less
        }
    }

    public static void main(String[] args) {
        // Create scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Array to store 5 numbers
        int[] numbers = new int[5];

        // Loop to take user input for 5 numbers
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        // Loop through the array to check each number
        for (int i = 0; i < numbers.length; i++) {
            int number = numbers[i];
            String positivity = isPositive(number);

            // Check if the number is positive or negative
            System.out.println("Number " + (i + 1) + ": " + number + " is " + positivity);

            // If the number is positive, check if it's even or odd
            if (positivity.equals("Positive")) {
                String evenOdd = isEven(number);
                System.out.println("It is " + evenOdd);
            }
        }

        // Compare the first and last numbers
        int comparisonResult = compare(numbers[0], numbers[numbers.length - 1]);
        if (comparisonResult == 1) {
            System.out.println("The first number is greater than the last number.");
        } else if (comparisonResult == 0) {
            System.out.println("The first number is equal to the last number.");
        } else {
            System.out.println("The first number is less than the last number.");
        }

        // Close the scanner
        scanner.close();
    }
}
