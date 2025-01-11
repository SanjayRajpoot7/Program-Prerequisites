import java.util.Scanner;

public class sumOfAllNumbers{

  public static void main(String[] args){
    Scanner obj = new Scanner(System.in);

    int[] newArray = new int[10]; 

    System.out.println("Enter number: ");
    for(int i=0; i < newArray.length-1 ; i++){
    newArray[i] = obj.nextInt();
    }
    

    int i=0;

    while(newArray[i] != 0 || newArray[i] > 0){ 
    System.out.println(newArray[i]);

    i++;
    }
 

    int sum=0;
    for(i = 0; i < newArray.length-1; i++){
     sum += newArray[i];
 }

    for( i = 0; i < newArray.length; i++){
    System.out.println(sum);
}
}
}
    
    