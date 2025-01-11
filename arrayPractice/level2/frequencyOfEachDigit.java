import java.util.Scanner;

public class frequencyOfEachDigit {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Take the number of students as input
        int[] number = new int[10];

        System.out.print("Enter the number: ");
        for(int i = 0; i < number.length; i++){
        number[i] = scanner.nextInt();
        }
        
        int[] countFrequency = new int[10];
        int count = 0, k=0;
        for(int i = 0; i < number.length-1; i++){
          for(int j = 1; j < number.length; j++){
               if(number[i] == number[j]){
               count++;
           }
         countFrequency[k++] = count;
        }
       }


        for(int store : number){
         System.out.println(store+" ");
        }

        for(int storeFrequency : countFrequency){
        System.out.println("Frequency of each number "+storeFrequency+" ");
      }
   }
}














