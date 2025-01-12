import java.util.Scanner;

public class BMI_Calculator {

    // Method to calculate BMI and populate the BMI values in the array
    public static void calculateBMI(double[][] data) {
        for (int i = 0; i < data.length; i++) {
            double weight = data[i][0];  // Weight in kg
            double height = data[i][1] / 100.0;  // Convert height from cm to meters
            // BMI formula: weight / (height^2)
            double bmi = weight / (height * height);
            data[i][2] = bmi;  // Store BMI in the third column
        }
    }

    // Method to determine the BMI status based on the BMI value
    public static String[] determineStatus(double[][] data) {
        String[] statuses = new String[data.length];
        for (int i = 0; i < data.length; i++) {
            double bmi = data[i][2];  // Retrieve the BMI value
            if (bmi < 18.5) {
                statuses[i] = "Underweight";
            } else if (bmi >= 18.5 && bmi < 24.9) {
                statuses[i] = "Normal weight";
            } else if (bmi >= 25 && bmi < 29.9) {
                statuses[i] = "Overweight";
            } else {
                statuses[i] = "Obesity";
            }
        }
        return statuses;
    }

    public static void main(String[] args) {
        // Create scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Array to store 10 people's weight, height, and BMI
        // 10 rows (persons), 3 columns (weight, height, bmi)
        double[][] data = new double[10][3];

        // Take user input for the weight and height of each person
        for (int i = 0; i < data.length; i++) {
            System.out.print("Enter weight (kg) for person " + (i + 1) + ": ");
            data[i][0] = scanner.nextDouble();

            System.out.print("Enter height (cm) for person " + (i + 1) + ": ");
            data[i][1] = scanner.nextDouble();
        }

        // Calculate BMI for all the persons
        calculateBMI(data);

        // Get the BMI status for all the persons
        String[] status = determineStatus(data);

        // Display the results: weight, height, BMI, and status
        System.out.println("\nPerson | Weight (kg) | Height (cm) | BMI     | Status");
        for (int i = 0; i < data.length; i++) {
            System.out.printf("%-7d | %-11.2f | %-12.2f | %-7.2f | %s\n",
                    i + 1, data[i][0], data[i][1], data[i][2], status[i]);
        }

        // Close the scanner
        scanner.close();
    }
}
