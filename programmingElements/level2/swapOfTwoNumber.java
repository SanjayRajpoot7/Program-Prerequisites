import java.util.Scanner;

public class swapOfTwoNumber {

    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);

        System.out.print("Enter first ");
        int first = obj.nextInt();
    
        System.out.print("Enter second ");
        int second = obj.nextInt();

        int temp = first;
        first = second;
        second = temp;


        // Display the result
        System.out.println("The swapped number are "+ first +" and "+ second);
       
    }
}
