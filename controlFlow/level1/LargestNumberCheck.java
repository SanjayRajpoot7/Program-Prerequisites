import java.util.Scanner;

public class LargestNumberCheck {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        // Take input 
        System.out.print("Enter the first number: ");
        int number1 = scanner.nextInt();
        
        // Take input
        System.out.print("Enter the second number: ");
        int number2 = scanner.nextInt();
        
        // Take input
        System.out.print("Enter the third number: ");
        int number3 = scanner.nextInt();
        
        // Check if the first number is the largest
        if (number1 >= number2 && number1 >= number3) {
            System.out.println("Is the first number the largest? Yes");
        } else {
            System.out.println("Is the first number the largest? No");
        }

        // Check if the second number is the largest
        if (number2 >= number1 && number2 >= number3) {
            System.out.println("Is the second number the largest? Yes");
        } else {
            System.out.println("Is the second number the largest? No");
        }

        // Check third number is the largest
        if (number3 >= number1 && number3 >= number2) {
            System.out.println("Is the third number the largest? Yes");
        } else {
            System.out.println("Is the third number the largest? No");
        }

       
        scanner.close();
    }
}
