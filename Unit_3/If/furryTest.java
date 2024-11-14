package Unit_3.If;

import java.util.Scanner;

public class furryTest 
{
      public static void main(String[] args)
  {
      System.out.println("\n\nLet's play 20 questions. Choose an animal and I will try to guess it!");
      Scanner scan = new Scanner(System.in);

      System.out.println("Is it a mammal (y/n)?");
      String answer = scan.next(); // in other IDEs, use nextLine()
      if (answer.equals("y"))
      {
          System.out.println("Is it a pet (y/n)?");
          answer = scan.next();
          if (answer.equals("y"))
          {
               // Uncomment the question and answer code below.
              // Add in your question to distinguish cat vs dog
               System.out.println("Does it like to go on walks (y/n)?");
               answer = scan.next();
               if (answer.equals("y")){
              // Add another if/else to guess a cat vs dog
              System.out.println("I guess a dog! Click on run to play again."); }
              else {
                System.out.print("I guess a cat! Click on run to play again.");
              }
          }
          else
          {
              System.out.println("I guess an elephant! Click on run to play again.");
          }
      }
      else { // not a mammal
          // Uncomment the question and answer code below.
          // Add in your question to distinguish turtle vs bird
           System.out.println("Does it have a shell (y/n)?");
           answer = scan.next();
          // Add another if/else to guess a turtle vs bird
          if (answer.equals("y")){
          System.out.println("I guess a turtle! Click on run to play again.");
          } else  {
            System.out.println("I guess a bird! Click on run to play again.");

          }
        }
    }
}