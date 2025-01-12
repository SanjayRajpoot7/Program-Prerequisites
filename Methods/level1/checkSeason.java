import java.util.Scanner;

    public class checkSeason{
       
       
        void checkSeason(int month,int day ){
         
         if( month == 3 && day >20 || month == 4 || month == 5 || month == 6 && day <=20){
         System.out.println("It is spring season ");
         }
         
         else{
         System.out.println("It is not a spring season ");
         }

      }

        public static void main(String[] args){

        Scanner obj = new Scanner(System.in);

        System.out.println("Enter a month: ");
        int month = obj.nextInt();

        System.out.println("Enter a day: ");
        int day = obj.nextInt();
        
        checkSeason ref1 = new checkSeason();
        ref1.checkSeason(month,day); 
        
       
   }
}