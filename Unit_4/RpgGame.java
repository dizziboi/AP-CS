package Unit_4;

import java.util.Scanner;

public class RpgGame {
    public static double rpgGame(){
        Scanner character_Name = new Scanner(System.in); //makes the scanner object for the *scanner* input
        System.out.println("What is your name ");
        String name = character_Name.nextLine(); //reads the scanner 
        
        Scanner character_Race = new Scanner(System.in); //makes the scanner object for the *scanner* input
        System.out.println("What is your race ");
        String race = character_Race.nextLine(); //reads the scanner
        
        Scanner character_Job = new Scanner(System.in); //makes the scanner object for the *scanner* input
        System.out.println("What is your job ");
        String job = character_Job.nextLine(); //reads the scanner
        
        System.out.println("Name: " + name + "\n" + "Race: " + race + "\n" + "Job: " + job);
        return 0;
    }
    public static void main(String[] args) {
    rpgGame();
}
    
}
