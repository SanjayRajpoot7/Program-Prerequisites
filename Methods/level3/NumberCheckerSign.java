public class NumberCheckerSign {

    // Method to check if a number is prime
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Method to check if a number is a neon number
    public static boolean isNeonNumber(int number) {
        int square = number * number;
        int sum = 0;
        while (square > 0) {
            sum += square % 10;
            square /= 10;
        }
        return sum == number;
    }

    // Method to check if a number is a spy number
    public static boolean isSpyNumber(int number) {
        int sum = 0;
        int product = 1;
        while (number > 0) {
            int digit = number % 10;
            sum += digit;
            product *= digit;
            number /= 10;
        }
        return sum == product;
    }

    // Method to check if a number is an automorphic number
    public static boolean isAutomorphicNumber(int number) {
        int square = number * number;
        return (square % (int) Math.pow(10, countDigits(number))) == number;
    }

    // Method to check if a number is a buzz number
    public static boolean isBuzzNumber(int number) {
        return (number % 7 == 0 || number % 10 == 7);
    }

    // Helper method to count digits in a number
    public static int countDigits(int number) {
        return Integer.toString(number).length();
    }

    public static void main(String[] args) {
        int number = 27; // Example number, you can change it as needed

        // Check if the number is prime
        boolean isPrime = isPrime(number);
        System.out.println("Is " + number + " a prime number? " + isPrime);

        // Check if the number is a neon number
        boolean isNeon = isNeonNumber(number);
        System.out.println("Is " + number + " a neon number? " + isNeon);

        // Check if the number is a spy number
        boolean isSpy = isSpyNumber(number);
        System.out.println("Is " + number + " a spy number? " + isSpy);

        // Check if the number is an automorphic number
        boolean isAutomorphic = isAutomorphicNumber(number);
        System.out.println("Is " + number + " an automorphic number? " + isAutomorphic);

        // Check if the number is a buzz number
        boolean isBuzz = isBuzzNumber(number);
        System.out.println("Is " + number + " a buzz number? " + isBuzz);
    }
}
