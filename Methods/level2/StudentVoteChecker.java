import java.util.Scanner;

public class StudentVoteChecker {

    // Method to check if a student can vote based on their age
    public boolean canStudentVote(int age) {
        // Validate age to ensure it's not negative
        if (age < 0) {
            return false;  // Invalid age, can't vote
        }
        // Check if the student is 18 or older
        if (age >= 18) {
            return true;  // Eligible to vote
        } else {
            return false;  // Not eligible to vote
        }
    }

    public static void main(String[] args) {
        // Create a scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Create an instance of StudentVoteChecker
        StudentVoteChecker voteChecker = new StudentVoteChecker();

        // Define an array to store the ages of 10 students
        int[] studentAges = new int[10];

        // Loop through the array to take user input for the student's age
        for (int i = 0; i < studentAges.length; i++) {
            System.out.print("Enter age of student " + (i + 1) + ": ");
            studentAges[i] = scanner.nextInt();
        }

        // Check whether each student can vote and display the result
        for (int i = 0; i < studentAges.length; i++) {
            if (voteChecker.canStudentVote(studentAges[i])) {
                System.out.println("Student " + (i + 1) + " (Age: " + studentAges[i] + ") can vote.");
            } else {
                System.out.println("Student " + (i + 1) + " (Age: " + studentAges[i] + ") cannot vote.");
            }
        }

        // Close the scanner
        scanner.close();
    }
}
