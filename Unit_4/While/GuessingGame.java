

import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
    // Choose a random number from 0-100
        Scanner scan = new Scanner(System.in);
        int numGuess = 0;
        while (numGuess < 7) {
        int randNumb =(int) (100*(Math.random()));
        //System.out.println(randNumb); // prints answer
            System.out.println("Type in a number ");
            int guess = scan.nextInt(); //reads the scanner 
            if (guess > randNumb){
                System.out.println("Too high!");
                numGuess++;
                System.out.println(7 - numGuess + " Guesses left");
            } else if (guess < randNumb){
                System.out.println("Too Loo!");
                numGuess++;
                System.out.println(7 - numGuess + " Guesses left");
            } else if (guess == randNumb){
                System.out.println("You got it");
            } else if (numGuess < 8){
                System.out.println("");
                numGuess = 0;
            }
        }
    }
}
