import java.util.Random;
import java.util.Scanner;

public class StudentScorecard {

    // Method to generate random 2-digit scores for Physics, Chemistry, and Maths for all students
    public static int[][] generateRandomScores(int numStudents) {
        Random random = new Random();
        int[][] scores = new int[numStudents][3]; // 3 columns: Physics, Chemistry, and Maths

        for (int i = 0; i < numStudents; i++) {
            // Generate random 2-digit scores between 50 and 100
            scores[i][0] = 50 + random.nextInt(51); // Physics score
            scores[i][1] = 50 + random.nextInt(51); // Chemistry score
            scores[i][2] = 50 + random.nextInt(51); // Maths score
        }

        return scores;
    }

    // Method to calculate total, average, and percentage for each student
    public static double[][] calculateTotalAveragePercentage(int[][] scores) {
        double[][] results = new double[scores.length][4]; // 4 columns: Total, Average, Percentage, and student number

        for (int i = 0; i < scores.length; i++) {
            // Calculate total score
            int total = scores[i][0] + scores[i][1] + scores[i][2];

            // Calculate average score
            double average = total / 3.0;

            // Calculate percentage
            double percentage = (total / 300.0) * 100;

            // Store the results in the array
            results[i][0] = total;
            results[i][1] = Math.round(average * 100.0) / 100.0; // Round to 2 decimal places
            results[i][2] = Math.round(percentage * 100.0) / 100.0; // Round to 2 decimal places
            results[i][3] = i + 1; // Store student number
        }

        return results;
    }

    // Method to display the scorecard of all students in a tabular format
    public static void displayScorecard(int[][] scores, double[][] results) {
        System.out.println("Student No.\tPhysics "+ " \tChemistry\tMaths     "+"    \tTotal "+" \tAverage"+"\tPercentage");

        // Loop through each student and print their data
        for (int i = 0; i < scores.length; i++) {
            System.out.printf("%d\t\t%d\t\t%d\t\t%d\t\t%.2f\t%.2f\t%.2f\n", 
                              (i + 1), 
                              scores[i][0], 
                              scores[i][1], 
                              scores[i][2], 
                              results[i][0], 
                              results[i][1], 
                              results[i][2]);
        }
    }

    public static void main(String[] args) {
        // Input: Number of students
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();

        // Step 1: Generate random scores for each student
        int[][] scores = generateRandomScores(numStudents);

        // Step 2: Calculate total, average, and percentage for each student
        double[][] results = calculateTotalAveragePercentage(scores);

        // Step 3: Display the results in a tabular format
        displayScorecard(scores, results);
    }
}
