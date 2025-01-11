import java.util.Scanner;

public class checkDivisibility {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        //Number 
        System.out.print("Enter number: ");
        int number = scanner.nextInt();


        if(number % 5  ==  0){
        System.out.print("Is the number "+number+" divisible by 5? "+"Yes");
        }

        else{
        System.out.print("Is the number "+number+" divisible by 5? "+"No");
        }

       
        
        // Close the scanner
        scanner.close();
    }
}
