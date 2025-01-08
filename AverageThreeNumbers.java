import java.util.*;

public class AverageThreeNumbers
 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Enter the first number: ");
        int first = scanner.nextInt();
        
        System.out.print("Enter the second number: ");
        int second = scanner.nextInt();

        System.out.print("Enter the third number: ");
        int third = scanner.nextInt();
        
       
        long result = (long)(first+second+third)/3;
        
        System.out.println("Average of three numbers: "+ result);
        
        
    }
}
