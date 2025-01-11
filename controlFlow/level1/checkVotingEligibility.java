import java.util.Scanner;

public class checkVotingEligibility {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);
        
        // Take input for the age
        System.out.print("Enter the person's age: ");
        int age = scanner.nextInt();
        
        // Check if the age is greater than or equal to 18
        if (age >= 18) {
            System.out.println("The person's age is " + age + " and can vote.");
        } else {
            System.out.println("The person's age is " + age + " and cannot vote.");
        }
        
       
        scanner.close();
    }
}
