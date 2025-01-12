import java.util.Scanner;

    public class numberOfHandShake{


        int handShake(int student){
        
        int totalHandShake = (student *(student - 1) / 2);

        return totalHandShake;
        

        }
        

        public static void main(String[] args){

        Scanner obj = new Scanner(System.in);

        System.out.println("Enter number of students: ");
        int student = obj.nextInt();
      


        numberOfHandShake ref1 = new numberOfHandShake();
        int store = ref1.handShake(student); 
        

        System.out.println("Total number of handshake of student "+store);
   }
}