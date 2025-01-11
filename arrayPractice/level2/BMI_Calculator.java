import java.util.Scanner;

public class BMI_Calculator {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Take the number of persons as input
        System.out.print("Enter the number of persons: ");
        int numberOfPersons = scanner.nextInt();

        // Create arrays to store weight, height, BMI, and weight status for each person
        double[] weight = new double[numberOfPersons];
        double[] height = new double[numberOfPersons];
        double[] bmi = new double[numberOfPersons];
        String[] weightStatus = new String[numberOfPersons];

        // Loop to take input for weight and height and calculate BMI for each person
        for (int i = 0; i < numberOfPersons; i++) {
            System.out.print("\nEnter weight (in kg) for person " + (i + 1) + ": ");
            weight[i] = scanner.nextDouble();

            System.out.print("Enter height (in meters) for person " + (i + 1) + ": ");
            height[i] = scanner.nextDouble();

            // Calculate BMI
            bmi[i] = weight[i] / (height[i] * height[i]);

            // Determine weight status based on BMI value
            if (bmi[i] < 18.5) {
                weightStatus[i] = "Underweight";
            } else if (bmi[i] >= 18.5 && bmi[i] < 24.9) {
                weightStatus[i] = "Normal weight";
            } else if (bmi[i] >= 25 && bmi[i] < 29.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        // Display the results for each person
        System.out.println("\nBMI Results: ");
        System.out.println("--------------------------------------------------");
        System.out.printf("%-10s %-10s %-10s %-10s %-15s\n", "Person", "Weight", "Height", "BMI", "Weight Status");
        System.out.println("--------------------------------------------------");
        
        for (int i = 0; i < numberOfPersons; i++) {
            System.out.printf("%-10s %-10.2f %-10.2f %-10.2f %-15s\n", "Person " + (i + 1), weight[i], height[i], bmi[i], weightStatus[i]);
        }

        // Close the scanner
        scanner.close();
    }
}
