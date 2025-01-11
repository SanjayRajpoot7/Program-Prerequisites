import java.util.Scanner;

public class ditributedChocolates {

    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);
        
        // Taking user input number of chocolates
        System.out.print("Enter no. chocolates ");
        int chocolate = obj.nextInt();

        // Taking user input number of children
        System.out.print("Enter no. of children ");
        int children = obj.nextInt();

        // Finding how many chocolate get each children
        int distributeChocolate = chocolate / children;
       
        // Finding how many remaining chocolate
        int remainingChocolate = chocolate % children;

        // Display the result
        System.out.println("The number of chocolates each child gets is "+distributeChocolate+" and the number of remaining chocolates are "+ remainingChocolate);
       
    }
}
