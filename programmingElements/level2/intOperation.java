import java.util.Scanner;
public class intOperation {
    public static void main(String[] args) {

      Scanner obj = new Scanner(System.in);
      System.out.print("Enter first number ");
        //First user
        int a = obj.nextInt();

        System.out.print("Enter second number ");
        // Second user
        int b = obj.nextInt();

        System.out.print("Enter third number ");
        // Third user
        int c = obj.nextInt();

        

        // Display the result
        System.out.println("operations a + b *c = "+ a + b * c);
        System.out.println("operations a * b + c = "+ a * b + c);
        System.out.println("operations c + a / b = "+ a + b / c);
        System.out.println("operations a % b + c = "+ a % b + c);
       
    }
}
