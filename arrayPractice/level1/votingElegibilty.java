import java.util.Scanner;

public class votingElegibilty{

  public static void main(String[] args){
    Scanner obj = new Scanner(System.in);

    int number = 10;
    int[] studentArray = new int[number];
    

    System.out.println("Enter student age ");
    for(int i=0; i < number; i++){
    studentArray[i] = obj.nextInt();
    }

    for(int i=0; i < number; i++){
    if(studentArray[i] >= 18){
    System.out.println("The student with the age "+ studentArray[i]  +" can vote");
    }
    else{
    System.out.println("The student with the age "+ studentArray[i] +" can not vote");
    }
  }
}
}
  
