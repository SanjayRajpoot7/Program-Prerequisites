import java.util.Scanner;

public class salaryAndBonus {

    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);

        System.out.print("Enter salary ");
        int salary = obj.nextInt();
    
        System.out.print("Enter bonus ");
        int bonus = obj.nextInt();

        double total = salary + bonus;

        // Display the result
        System.out.println("The salary is INR "+ salary +" and bonus is INR "+bonus+". Hence total income is "+total);
       
    }
}
