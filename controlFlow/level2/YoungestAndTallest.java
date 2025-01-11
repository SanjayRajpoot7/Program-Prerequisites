import java.util.Scanner;

public class YoungestAndTallest {

    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Input for Amar's age and height
        System.out.print("Enter Amar's age: ");
        int ageAmar = scanner.nextInt();
        System.out.print("Enter Amar's height (in cm): ");
        int heightAmar = scanner.nextInt();

        // Input for Akbar's age and height
        System.out.print("Enter Akbar's age: ");
        int ageAkbar = scanner.nextInt();
        System.out.print("Enter Akbar's height (in cm): ");
        int heightAkbar = scanner.nextInt();

        // Input for Anthony's age and height
        System.out.print("Enter Anthony's age: ");
        int ageAnthony = scanner.nextInt();
        System.out.print("Enter Anthony's height (in cm): ");
        int heightAnthony = scanner.nextInt();

        // Find the youngest friend based on age
        int youngestAge = ageAmar;
        String youngestFriend = "Amar";
        
        if (ageAkbar < youngestAge) {
            youngestAge = ageAkbar;
            youngestFriend = "Akbar";
        }
        if (ageAnthony < youngestAge) {
            youngestAge = ageAnthony;
            youngestFriend = "Anthony";
        }
        
        // Find the tallest friend based on height
        int tallestHeight = heightAmar;
        String tallestFriend = "Amar";
        
        if (heightAkbar > tallestHeight) {
            tallestHeight = heightAkbar;
            tallestFriend = "Akbar";
        }
        if (heightAnthony > tallestHeight) {
            tallestHeight = heightAnthony;
            tallestFriend = "Anthony";
        }

        // Display the results
        System.out.println(youngestFriend + " is the youngest friend with age " + youngestAge);
        System.out.println(tallestFriend + " is the tallest friend with height " + tallestHeight + " cm");

        // Close the scanner
        scanner.close();
    }
}
