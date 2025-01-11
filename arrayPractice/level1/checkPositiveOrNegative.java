import java.util.Scanner;

public class checkPositiveOrNegative{

  public static void main(String[] args){
    Scanner obj = new Scanner(System.in);

    int number = 5;
    int[] numberArray = new int[number];

    System.out.println("Enter number: ");
    for(int i=0; i < number; i++){
    numberArray[i] = obj.nextInt();
    }

    for(int i=0; i < number; i++){
    if(numberArray[i] >= 1 ){
       if(numberArray[i] % 2 == 0){

         System.out.println(numberArray[i] +" It is even number ");
        }
        else{
         System.out.println(numberArray[i] +" It is odd number ");
       }
      }

     else if(numberArray[i] == 0){
      System.out.println(numberArray[i] +" is zero ");
      }

      else{
       System.out.println(numberArray[i] +" is negative number ");
       }

  }

   if(numberArray[0] == numberArray[number-1]){
    System.out.println("Both are equal ");
    }
    else if(numberArray[0] <= numberArray[number-1]){
    System.out.println("Last element is greater ");
    }
    else{
    System.out.println("first element is greater ");
    }
}
}