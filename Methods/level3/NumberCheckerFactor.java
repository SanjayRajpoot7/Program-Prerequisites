public class NumberCheckerFactor {

    // Method to find factors of a number and return them as an array
    public static int[] findFactors(int number) {
        int count = 0;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                count++;
            }
        }
        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                factors[index++] = i;
            }
        }
        return factors;
    }

    // Method to find the greatest factor of a number using the factors array
    public static int greatestFactor(int number) {
        int[] factors = findFactors(number);
        int greatest = 0;
        for (int factor : factors) {
            if (factor > greatest) {
                greatest = factor;
            }
        }
        return greatest;
    }

    // Method to find the sum of the factors using the factors array
    public static int sumOfFactors(int number) {
        int[] factors = findFactors(number);
        int sum = 0;
        for (int factor : factors) {
            sum += factor;
        }
        return sum;
    }

    // Method to find the product of the factors using the factors array
    public static int productOfFactors(int number) {
        int[] factors = findFactors(number);
        int product = 1;
        for (int factor : factors) {
            product *= factor;
        }
        return product;
    }

    // Method to find the product of the cubes of the factors using the factors array
    public static double productOfCubesOfFactors(int number) {
        int[] factors = findFactors(number);
        double product = 1;
        for (int factor : factors) {
            product *= Math.pow(factor, 3);
        }
        return product;
    }

    // Method to check if a number is a perfect number
    public static boolean isPerfectNumber(int number) {
        return sumOfFactors(number) == number;
    }

    // Method to check if a number is an abundant number
    public static boolean isAbundantNumber(int number) {
        return sumOfFactors(number) > number;
    }

    // Method to check if a number is a deficient number
    public static boolean isDeficientNumber(int number) {
        return sumOfFactors(number) < number;
    }

    // Method to check if a number is a strong number
    public static boolean isStrongNumber(int number) {
        int originalNumber = number;
        int sumOfFactorials = 0;
        while (number > 0) {
            int digit = number % 10;
            sumOfFactorials += factorial(digit);
            number /= 10;
        }
        return sumOfFactorials == originalNumber;
    }

    // Helper method to calculate the factorial of a number
    public static int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        int number = 28; // You can change the number for testing
        
        // Find factors
        int[] factors = findFactors(number);
        System.out.print("Factors of " + number + ": ");
        for (int factor : factors) {
            System.out.print(factor + " ");
        }
        System.out.println();

        // Greatest factor
        int greatest = greatestFactor(number);
        System.out.println("Greatest factor of " + number + ": " + greatest);

        // Sum of factors
        int sumFactors = sumOfFactors(number);
        System.out.println("Sum of factors of " + number + ": " + sumFactors);

        // Product of factors
        int productFactors = productOfFactors(number);
        System.out.println("Product of factors of " + number + ": " + productFactors);

        // Product of cubes of factors
        double productCubes = productOfCubesOfFactors(number);
        System.out.println("Product of cubes of factors of " + number + ": " + productCubes);

        // Check if the number is perfect
        boolean isPerfect = isPerfectNumber(number);
        System.out.println(number + " is a perfect number: " + isPerfect);

        // Check if the number is abundant
        boolean isAbundant = isAbundantNumber(number);
        System.out.println(number + " is an abundant number: " + isAbundant);

        // Check if the number is deficient
        boolean isDeficient = isDeficientNumber(number);
        System.out.println(number + " is a deficient number: " + isDeficient);

        // Check if the number is strong
        boolean isStrong = isStrongNumber(number);
        System.out.println(number + " is a strong number: " + isStrong);
    }
}
