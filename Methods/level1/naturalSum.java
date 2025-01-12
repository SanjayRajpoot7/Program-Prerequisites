import java.util.Scanner;

    public class naturalSum{
       
       
        void sumAllNaturalNumbers(int number){
         long sum = (number * ( number - 1 ) / 2);
          System.out.println("Natural sum of this number "+sum);
      

        }

        public static void main(String[] args){

        Scanner obj = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number = obj.nextInt();
        
        naturalSum ref1 = new naturalSum();
        ref1.sumAllNaturalNumbers(number); 
        
       
   }
}