import java.util.Random;

public class StudentGrades {

    // Method to generate random 2-digit scores for Physics, Chemistry, and Maths
    public static int[][] generateScores(int numStudents) {
        Random random = new Random();
        int[][] scores = new int[numStudents][3];

        // Generate random scores for each student in PCM (Physics, Chemistry, and Maths)
        for (int i = 0; i < numStudents; i++) {
            scores[i][0] = 50 + random.nextInt(51); // Random score between 50 and 100 for Physics
            scores[i][1] = 50 + random.nextInt(51); // Random score between 50 and 100 for Chemistry
            scores[i][2] = 50 + random.nextInt(51); // Random score between 50 and 100 for Maths
        }

        return scores;
    }

    // Method to calculate total, average, and percentage for each student
    public static double[][] calculateTotalAveragePercentage(int[][] scores) {
        int numStudents = scores.length;
        double[][] result = new double[numStudents][4]; // Store total, average, percentage

        for (int i = 0; i < numStudents; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;

            result[i][0] = total; // Total marks
            result[i][1] = average; // Average marks
            result[i][2] = Math.round(percentage * 100.0) / 100.0; // Percentage (rounded to 2 decimal places)
        }

        return result;
    }

    // Method to calculate grade based on percentage
    public static String[][] calculateGrades(double[][] percentageData) {
        int numStudents = percentageData.length;
        String[][] grades = new String[numStudents][2]; // Store grade for each student

        for (int i = 0; i < numStudents; i++) {
            double percentage = percentageData[i][2];
            String grade = "";

            // Assign grade based on percentage
            if (percentage >= 80) {
                grade = "Level 4, above agency-normalized standards";
            } else if (percentage <= 79 && percentage >= 70) {
                grade = "Level 3, at agency-normalized standards";
            } else if (percentage <= 69 && percentage >= 60) {
                grade = "Level 2, below agency-normalized standards";
            } else if ( percentage <= 59 && percentage >= 50) {
                grade = "Level 1, well below agency-normalized standards";
            } else if (percentage <= 49 && percentage >= 40) {
                grade = "Level 1-, too below agency-normalized standards";
            } else {
                grade = "Remedial standards";
            }

            grades[i][0] = String.valueOf(percentageData[i][2]); // Store percentage
            grades[i][1] = grade; // Store grade
        }

        return grades;
    }

    // Method to display the scorecard of all students in a tabular format
    public static void displayScorecard(int[][] scores, double[][] results, String[][] grades) {
        System.out.println("Student\tPhysics\tChemistry\tMaths\tTotal\tAverage\tPercentage\tGrade");
        System.out.println("--------------------------------------------------------------------------------");

        for (int i = 0; i < scores.length; i++) {
            System.out.printf("%d\t%d\t\t%d\t\t%d\t%.2f\t%.2f\t%.2f\t\t%s\n",
                    i + 1, 
                    scores[i][0], scores[i][1], scores[i][2],
                    results[i][0], results[i][1], results[i][2], grades[i][1]);
        }
    }

    public static void main(String[] args) {
        int numStudents = 10; // Number of students
        int[][] scores = generateScores(numStudents); // Generate random scores
        double[][] results = calculateTotalAveragePercentage(scores); // Calculate total, average, percentage
        String[][] grades = calculateGrades(results); // Calculate grades based on percentage

        // Display the scorecard
        displayScorecard(scores, results, grades);
    }
}
