import java.util.Scanner;

    public class simpleInterest{


        int calculateSimpleInterest(int principal, int rate, int time){
        
        int SI = (principal * rate * time) / 100;
        return SI;

        }
        

        public static void main(String[] args){

        Scanner obj = new Scanner(System.in);

        System.out.println("Enter principal: ");
        int principal = obj.nextInt();
        

        System.out.println("Enter rate: ");
        int rate = obj.nextInt();


        System.out.println("Enter time: ");
        int time = obj.nextInt();


        simpleInterest ref1 = new simpleInterest();
        int store = ref1.calculateSimpleInterest(principal,rate,time); 
        

        System.out.println( "The Simple Interest is "+store+" for Principal "+ principal+", Rate of Interest "+ rate +" and Time "+time);
   }
}