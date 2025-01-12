import java.util.Scanner;

    public class checkSign{
       
       
        void checkNumber(int number){
         
         if(number < 0){
         System.out.println("Number is negative ");
         }
         else if(number > 0){
         System.out.println("Number is positive ");
         }
         else{
         System.out.println("Number is zero ");
         }

      }

        public static void main(String[] args){

        Scanner obj = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number = obj.nextInt();
        
        checkSign ref1 = new checkSign();
        ref1.checkNumber(number); 
        
       
   }
}