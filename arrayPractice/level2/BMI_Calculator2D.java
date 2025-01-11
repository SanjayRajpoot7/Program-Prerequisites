import java.util.Scanner;

public class BMI_Calculator {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Take the number of persons as input
        System.out.print("Enter the number of persons: ");
        int numberOfPersons = scanner.nextInt();

        // Create a 2D array to store weight, height, and BMI for each person
        double[][] personData = new double[numberOfPersons][3]; // 3 columns: weight, height, BMI
        String[] weightStatus = new String[numberOfPersons];

        // Loop to take input for weight and height and calculate BMI for each person
        for (int i = 0; i < numberOfPersons; i++) {
            // Input weight for the person, ensure it is a positive number
            double weight;
            do {
                System.out.print("Enter weight (in kg) for person " + (i + 1) + ": ");
                weight = scanner.nextDouble();
                if (weight <= 0) {
                    System.out.println("Please enter a valid positive weight.");
                }
            } while (weight <= 0);

            // Input height for the person, ensure it is a positive number
            double height;
            do {
                System.out.print("Enter height (in meters) for person " + (i + 1) + ": ");
                height = scanner.nextDouble();
                if (height <= 0) {
                    System.out.println("Please enter a valid positive height.");
                }
            } while (height <= 0);

            // Store weight and height in the personData array
            personData[i][0] = weight;
            personData[i][1] = height;

            // Calculate BMI and store in the personData array
            personData[i][2] = weight / (height * height);

            // Determine weight status based on BMI value
            if (personData[i][2] < 18.5) {
                weightStatus[i] = "Underweight";
            } else if (personData[i][2] >= 18.5 && personData[i][2] < 24.9) {
                weightStatus[i] = "Normal weight";
            } else if (personData[i][2] >= 25 && personData[i][2] < 29.9) {
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
            System.out.printf("%-10s %-10.2f %-10.2f %-10.2f %-15s\n", "Person " + (i + 1), personData[i][0], personData[i][1], personData[i][2], weightStatus[i]);
        }

        // Close the scanner
        scanner.close();
    }
}
