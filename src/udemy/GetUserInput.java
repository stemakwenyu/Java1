
package udemy;

import java.util.Scanner;


public class GetUserInput {
    public static void main (String[] args) {
        //part of previous lecture
        
      Scanner input = new Scanner(System.in);
        int number = 0;
      
      /*System.out.println("Enter a text Line: ");
      String text = input.nextLine();
      System.out.println("Your Line is: " + text)*/
      
      //do while loops
      do{
          System.out.println("Enter a number");
          number = input.nextInt();
      }
      while(number !=9);
       System.out.println("You got 9");
    }
}
