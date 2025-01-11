import java.util.Scanner;

public class calculateSimpleInterest {

    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);
        
        // Taking user input principal
        System.out.print("Enter total amount ");
        int principal = obj.nextInt();

        // Taking user input interest rate
        System.out.print("Enter interest rate ");
        int rate = obj.nextInt();

         // Taking user input duration
        System.out.print("Enter duration ");
        int time = obj.nextInt();


        double simpleInterest = principal * rate * time / 100;

        // Display the result
        System.out.println("The Simple Interest is "+ simpleInterest +" for Principal "+ principal +", Rate of Interest "+ rate +" and Time "+ time);
       
    }
}
