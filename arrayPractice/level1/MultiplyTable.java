import java.util.Scanner;

public class MultiplyTable{

  public static void main(String[] args){
    Scanner obj = new Scanner(System.in);

    int[] newArray = new int[10]; 
    
    int i;
    System.out.println("Enter number: ");
    for(i=6; i <= 9 ; i++){
    newArray[i] = i * 9;
    System.out.println(i + " * " + 9 +" = " + newArray[i]);
    }


}
}