import java.util.Scanner;

public class GradeCalculator2D {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Take the number of students as input
        System.out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();

        // Create a 2D array to store the marks of students in Physics, Chemistry, and Maths
        double[][] marks = new double[numberOfStudents][3];  // 2D array for marks (3 subjects)
        double[] percentages = new double[numberOfStudents];  // Array to store percentages
        String[] grades = new String[numberOfStudents];       // Array to store grades

        // Loop to take input for marks in physics, chemistry, and maths for each student
        for (int i = 0; i < numberOfStudents; i++) {
            double physics, chemistry, maths;

            // Input marks for physics, ensure marks are non-negative
            do {
                System.out.print("Enter marks for Physics for student " + (i + 1) + ": ");
                physics = scanner.nextDouble();
                if (physics < 0) {
                    System.out.println("Please enter valid non-negative marks.");
                }
            } while (physics < 0);

            // Input marks for chemistry, ensure marks are non-negative
            do {
                System.out.print("Enter marks for Chemistry for student " + (i + 1) + ": ");
                chemistry = scanner.nextDouble();
                if (chemistry < 0) {
                    System.out.println("Please enter valid non-negative marks.");
                }
            } while (chemistry < 0);

            // Input marks for maths, ensure marks are non-negative
            do {
                System.out.print("Enter marks for Maths for student " + (i + 1) + ": ");
                maths = scanner.nextDouble();
                if (maths < 0) {
                    System.out.println("Please enter valid non-negative marks.");
                }
            } while (maths < 0);

            // Store the marks in the 2D array (marks for each student)
            marks[i][0] = physics;  // Physics marks
            marks[i][1] = chemistry; // Chemistry marks
            marks[i][2] = maths;     // Maths marks

            // Calculate the total marks and percentage
            double totalMarks = physics + chemistry + maths;
            double percentage = (totalMarks / 300) * 100;
            percentages[i] = percentage;

            // Calculate the grade based on percentage
            if (percentage >= 90) {
                grades[i] = "A";
            } else if (percentage >= 75) {
                grades[i] = "B";
            } else if (percentage >= 50) {
                grades[i] = "C";
            } else {
                grades[i] = "D";
            }
        }

        // Display the marks, percentages, and grades for each student
        System.out.println("\nStudent Marks, Percentage, and Grades: ");
        System.out.println("-------------------------------------------------------------");
        System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s\n", "Student", "Physics", "Chemistry", "Maths", "Percentage", "Grade");
        System.out.println("-------------------------------------------------------------");

        for (int i = 0; i < numberOfStudents; i++) {
            System.out.printf("%-10s %-10.2f %-10.2f %-10.2f %-10.2f %-10s\n", "Student " + (i + 1), 
                marks[i][0], marks[i][1], marks[i][2], percentages[i], grades[i]);
        }

        // Close the scanner
        scanner.close();
    }
}
