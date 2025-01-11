import java.util.Scanner;

public class multiplicationTable{

  public static void main(String[] args){
    Scanner obj = new Scanner(System.in);

    System.out.print("Enter number: ");

    int number = obj.nextInt();
    
  
    int[] newArray = new int[11];
    for(int i=1; i <= 10; i++){
    newArray[i] = i * number;
    System.out.println(number + " * " + i +" = " + newArray[i]);
    
    }
 }
}
    
    