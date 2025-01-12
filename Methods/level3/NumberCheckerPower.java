import java.util.Arrays;

public class NumberCheckerPower{

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

    // Method to find the sum of the digits of the number using the digits array
    public static int sumOfDigits(int number) {
        int[] digits = storeDigits(number);
        int sum = 0;
        for (int digit : digits) {
            sum += digit;
        }
        return sum;
    }

    // Method to find the sum of the squares of the digits of the number using the digits array
    public static double sumOfSquaresOfDigits(int number) {
        int[] digits = storeDigits(number);
        double sumOfSquares = 0;
        for (int digit : digits) {
            sumOfSquares += Math.pow(digit, 2);
        }
        return sumOfSquares;
    }

    // Method to check if the number is a Harshad number using the digits array
    public static boolean isHarshadNumber(int number) {
        int sum = sumOfDigits(number);
        return number % sum == 0;
    }

    // Method to find the frequency of each digit in the number
    public static int[][] findDigitFrequency(int number) {
        int[] digits = storeDigits(number);
        int[][] frequency = new int[10][2]; // Array to store digits (0-9) and their frequencies

        // Initialize the first column with digit values (0-9)
        for (int i = 0; i < 10; i++) {
            frequency[i][0] = i;
        }

        // Count the frequency of each digit in the number
        for (int digit : digits) {
            frequency[digit][1]++;
        }

        // Filter out digits with zero frequency
        return Arrays.stream(frequency)
                     .filter(f -> f[1] > 0)
                     .toArray(int[][]::new);
    }

    public static void main(String[] args) {
        int number = 21; // Example number, you can change it as needed

        // Store digits of the number
        int[] digits = storeDigits(number);

        // Count digits
        int digitCount = countDigits(number);
        System.out.println("Number of digits: " + digitCount);

        // Sum of digits
        int sum = sumOfDigits(number);
        System.out.println("Sum of digits: " + sum);

        // Sum of squares of digits
        double sumOfSquares = sumOfSquaresOfDigits(number);
        System.out.println("Sum of squares of digits: " + sumOfSquares);

        // Check if the number is a Harshad number
        boolean isHarshad = isHarshadNumber(number);
        System.out.println("Is Harshad Number? " + isHarshad);

        // Find the frequency of each digit
        int[][] frequency = findDigitFrequency(number);
        System.out.println("Digit frequencies:");
        for (int[] digitFreq : frequency) {
            System.out.println("Digit " + digitFreq[0] + " appears " + digitFreq[1] + " times");
        }
    }
}
