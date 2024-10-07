//caleb brown
//due 10/1/24
//10/2/24
//pig Latin-Name Lab 

import java.util.Scanner;


public class namesort_piglatin
 {
        public static String printName() { //Method for asking your name 
        Scanner myName = new Scanner(System.in); //makes the scanner object for your name 
        System.out.println("what is your name"); //prints out the question
        String fullName = myName.nextLine(); //reads the scanner 
        int spaceFinder = fullName.indexOf(" ");// detects the first space in the name
        String firstName = fullName.substring(0,spaceFinder); // finds the first name
        System.out.println("First Name: " + firstName); //prints out the first name
        fullName = fullName.replaceFirst(firstName, ""); //removes the first name from the full name String 
        
        int middleLastLength = fullName.length(); //finds the length of the name 
        String fullNameTrimed = fullName.substring(1, middleLastLength); //resmoves front the space
        int spaceFinder2 = fullNameTrimed.indexOf(" ");// detects the second space in the name 
        String middleName = fullNameTrimed.substring(0,spaceFinder2); //finds the middle name
        System.out.println("Middle name: "+ middleName); //prints the middle name
        fullNameTrimed = fullNameTrimed.replaceFirst(middleName, ""); //removes the middle name
        
        int lastLength = fullNameTrimed.length(); //finds the length of the name 
        fullNameTrimed = fullNameTrimed.substring(1, lastLength); //resmoves front the space
        String lastName = fullNameTrimed; 
        System.out.println("Last name: " + lastName); //prints out the last name
        return firstName;

    }
     public static String pigLatin(){ 
        Scanner word = new Scanner(System.in); //makes the scanner object for your name 
        System.out.println("Type a word"); //prints out the question
        String inputWord = word.nextLine(); //reads the scanner  
        int wordLength = inputWord.length();
        char firstLetter = inputWord.charAt(0); //finds the first letter
        inputWord = inputWord.substring(1 , wordLength ); // removes the first letter
        inputWord = inputWord + firstLetter;

        String igyfied = inputWord + "ay" ; // adds the ay at the end 
        System.out.println("In piglatin: " + igyfied);
        return null;
        
    }
    
    public static void main(String[] args) {
        printName();
        pigLatin();
    }
}
