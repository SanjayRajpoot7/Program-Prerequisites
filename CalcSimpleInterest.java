
import java.util.*;
public class CalcSimpleInterest
{
   public static void main(String[] args){
     Scanner obj = new Scanner(System.in);

     System.out.println("Enter principal ");
     int principal=obj.nextInt();

     System.out.println("Enter rate ");
     int rate=obj.nextInt();

     System.out.println("Enter time ");
     int time=obj.nextInt();

     float SI=(principal*rate*time)/100;

      System.out.println(SI+" ");
   }
}