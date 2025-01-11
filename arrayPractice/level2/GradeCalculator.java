import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Take the number of students as input
        System.out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();

       
        double[] physicsMarks = new double[numberOfStudents];
        double[] chemistryMarks = new double[numberOfStudents];
        double[] mathsMarks = new double[numberOfStudents];
        double[] percentages = new double[numberOfStudents];
        String[] grades = new String[numberOfStudents];

       
        for (int i = 0; i < numberOfStudents; i++) {
            double physics, chemistry, maths;

          
            do {
                System.out.print("Enter marks for Physics for student " + (i + 1) + ": ");
                physics = scanner.nextDouble();
                if (physics < 0) {
                    System.out.println("Please enter valid non-negative marks.");
                }
            } while (physics < 0);


            do {
                System.out.print("Enter marks for Chemistry for student " + (i + 1) + ": ");
                chemistry = scanner.nextDouble();
                if (chemistry < 0) {
                    System.out.println("Please enter valid non-negative marks.");
                }
            } while (chemistry < 0);

          
            do {
                System.out.print("Enter marks for Maths for student " + (i + 1) + ": ");
                maths = scanner.nextDouble();
                if (maths < 0) {
                    System.out.println("Please enter valid non-negative marks.");
                }
            } while (maths < 0);


            
            // Store the marks in the respective arrays
            physicsMarks[i] = physics;
            chemistryMarks[i] = chemistry;
            mathsMarks[i] = maths;

            // Calculate the total marks and percentage
            double totalMarks = physics + chemistry + maths;
            double percentage = (totalMarks / 300) * 100;
            percentages[i] = percentage;

            // Calculate the grade based on percentage
            if (percentage >= 80) {
                grades[i] = "A";
            } else if (percentage >= 70 && percentage <= 79) {
                grades[i] = "B";
            } else if (percentage >= 60 && percentage <= 69) {
                grades[i] = "C";
            }  
             else if (percentage >= 50 && percentage <= 59) {
                grades[i] = "D";
            } 
             else if (percentage >= 40 && percentage <= 49) {
                grades[i] = "E";
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
                physicsMarks[i], chemistryMarks[i], mathsMarks[i], percentages[i], grades[i]);
        }

        // Close the scanner
        scanner.close();
    }
}
