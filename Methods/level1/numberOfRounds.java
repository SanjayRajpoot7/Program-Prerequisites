import java.util.Scanner;

    public class numberOfRounds{


       int countNumberOfRounds(int oneSide, int secondSide, int thirdSide, int distance){
        int additionOfRound = oneSide + secondSide + thirdSide;
        int perimeter = additionOfRound / distance;
    
        return perimeter;

        
        }
        

        public static void main(String[] args){

        Scanner obj = new Scanner(System.in);

        System.out.println("Enter one side: ");
        int oneSide = obj.nextInt();
        

        System.out.println("Enter second side: ");
        int secondSide = obj.nextInt();


        System.out.println("Enter thirdSide: ");
        int thirdSide = obj.nextInt();
   
        int distance = 5;


        numberOfRounds ref1 = new numberOfRounds();
        int store = ref1.countNumberOfRounds(oneSide,secondSide,thirdSide, distance); 
        

        System.out.println("To complete 5 km have to take round "+store);
   }
}