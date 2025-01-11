import java.util.Scanner;

public class GradeCalculator {

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Input marks for Physics, Chemistry, and Maths
        System.out.print("Enter marks for Physics: ");
        double physics = scanner.nextDouble();

        System.out.print("Enter marks for Chemistry: ");
        double chemistry = scanner.nextDouble();

        System.out.print("Enter marks for Maths: ");
        double maths = scanner.nextDouble();

        // Calculate total marks and percentage
        double totalMarks = physics + chemistry + maths;
        double percentage = (totalMarks / 300) * 100;

        // Display total marks and percentage
        System.out.println("\nTotal Marks: " + totalMarks);
        System.out.println("Percentage: " + percentage + "%");

        // Determine the grade and remarks based on percentage
        String grade;
        String remarks;

        // Define grade and remarks based on percentage
        if (percentage >= 90) {
            grade = "A";
            remarks = "Level 4, above";
        } else if (percentage >= 75) {
            grade = "B";
            remarks = "Level 3, at";
        } else if (percentage >= 50) {
            grade = "C";
            remarks = "Level 2, below";
        } else if (percentage >= 40) {
            grade = "D";
            remarks = "Level 1, well below";
        } else if (percentage >= 30) {
            grade = "E";
            remarks = "Level 1-, too below";
        } else {
            grade = "R";
            remarks = "Remedial Standard";
        }

        // Display the grade and remarks
        System.out.println("Grade: " + grade);
        System.out.println("Remarks: " + remarks);
        System.out.println("Got " + totalMarks + " out of 300");

        // Close the scanner
        scanner.close();
    }
}
