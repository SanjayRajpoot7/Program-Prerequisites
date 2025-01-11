import java.util.Scanner;

public class sqrtOfNumber{
   
    public static void main(String[] args){
     Scanner obj = new Scanner(System.in);
 
      int sqrt = 0;

      System.out.println("Enter a number: ");
      int number = obj.nextInt();   

      for(int i = 1; i < number; i++){
     
              if(i * i == number){
                  sqrt = i;
             }
            }
        

    if(sqrt == 0){

    System.out.println("No square root ");
   }
   else{
      System.out.println("Square root is "+sqrt);
     }
}
}