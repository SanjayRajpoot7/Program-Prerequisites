import java.util.Scanner;

public class TotalRoundToComplete {

    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);

        System.out.print("Enter one side ");
        float one = obj.nextInt();

        System.out.print("Enter one side ");
        float two = obj.nextInt();

        System.out.print("Enter one side ");
        float three = obj.nextInt();

        float totalPerimeter = one + two + three;

        float totalRounds = 5000/totalPerimeter;

        // Display the result
        System.out.println("The total number of rounds the athlete will run is "+totalRounds+" to complete 5 km");
       
    }
}
