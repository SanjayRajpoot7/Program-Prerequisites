import java.util.Scanner;
import java.util.Random;

public class VotingEligibility {

    // Method to generate random ages for 'n' students and return them as an array
    public static int[] generateRandomAges(int n) {
        Random random = new Random();
        int[] ages = new int[n];

        // Generate random 2-digit ages for 'n' students (age range: 10-99)
        for (int i = 0; i < n; i++) {
            ages[i] = 10 + random.nextInt(90);  // Random age between 10 and 99
        }
        return ages;
    }

    // Method to determine if each student can vote or not
    public static String[][] canVote(int[] ages) {
        String[][] result = new String[ages.length][2];

        // Check if each student can vote
        for (int i = 0; i < ages.length; i++) {
            if (ages[i] < 0) {
                result[i][0] = String.valueOf(ages[i]);
                result[i][1] = "Invalid Age"; // Negative age is invalid
            } else if (ages[i] >= 18) {
                result[i][0] = String.valueOf(ages[i]);
                result[i][1] = "Can Vote";
            } else {
                result[i][0] = String.valueOf(ages[i]);
                result[i][1] = "Cannot Vote";
            }
        }
        return result;
    }

    // Method to display the results in a tabular format
    public static void displayResults(String[][] data) {
        System.out.println("\nAge\tCan Vote?");
        System.out.println("------------------------");
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i][0] + "\t" + data[i][1]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input number of students
        System.out.println("Enter the number of students (should be 10): ");
        int n = scanner.nextInt();
        
        // Ensure the number of students is 10
        if (n != 10) {
            System.out.println("The number of students should be exactly 10.");
            return;
        }

        // Generate random ages for 10 students
        int[] ages = generateRandomAges(n);

        // Determine voting eligibility
        String[][] eligibility = canVote(ages);

        // Display the result in tabular format
        displayResults(eligibility);
    }
}
