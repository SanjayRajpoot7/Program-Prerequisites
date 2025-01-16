import java.util.Scanner;

public class BMICalculator {

    // Method to calculate BMI and status
    public static String[][] calculateBMIAndStatus(double[][] data) {
        String[][] result = new String[data.length][4];

        for (int i = 0; i < data.length; i++) {
            double weight = data[i][0];  // Weight in kg
            double heightCm = data[i][1]; // Height in cm
            double heightM = heightCm / 100; // Convert height to meters

            // BMI calculation
            double bmi = weight / (heightM * heightM);

            // Determine BMI status
            String status = "";
            if (bmi < 18.5) {
                status = "Underweight";
            } else if (bmi >= 18.5 && bmi < 24.9) {
                status = "Normal weight";
            } else if (bmi >= 25 && bmi < 29.9) {
                status = "Overweight";
            } else {
                status = "Obesity";
            }

            // Store the values in the result array
            result[i][0] = String.format("%.2f", weight); // Weight
            result[i][1] = String.format("%.2f", heightCm); // Height
            result[i][2] = String.format("%.2f", bmi); // BMI
            result[i][3] = status; // Status
        }

        return result;
    }

    // Method to display the BMI table
    public static void displayBMIReport(String[][] bmiData) {
        System.out.println("Person\tWeight (kg)\tHeight (cm)\tBMI\t\tStatus");
        System.out.println("-----------------------------------------------------------");

        for (int i = 0; i < bmiData.length; i++) {
            System.out.printf("%d\t%s\t\t%s\t\t%s\t%s\n", 
                i + 1, bmiData[i][0], bmiData[i][1], bmiData[i][2], bmiData[i][3]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create a 2D array to store weight and height for 10 persons
        double[][] teamData = new double[10][2]; // 10 persons, 2 columns (weight and height)

        // Take user input for weight and height of each person
        System.out.println("Enter the weight (in kg) and height (in cm) of 10 persons:");

        for (int i = 0; i < 10; i++) {
            System.out.println("Person " + (i + 1) + ":");
            System.out.print("Enter weight (kg): ");
            teamData[i][0] = scanner.nextDouble();
            System.out.print("Enter height (cm): ");
            teamData[i][1] = scanner.nextDouble();
        }

        // Calculate BMI and Status
        String[][] bmiReport = calculateBMIAndStatus(teamData);

        // Display the BMI report
        displayBMIReport(bmiReport);
    }
}
