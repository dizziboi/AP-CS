//caleb brown
//due 10/3/24
//10/1/24
//pig Latin-Name Lab 

/*notes
have a refresh function where it deletes the part of the name that was printed 
*/

package Unit_2.random;
import java.util.Scanner;

import Unit_1.random.cheating2;
import Unit_1.random.name;


public class name_sort {
        public static String printFirstName() { //Method for asking your name 
        Scanner myName = new Scanner(System.in); //makes the scanner object for your name 
        System.out.println("what is your name"); //prints out the question
        String fullName = myName.nextLine(); //reads the scanner 
        int spaceFinder = fullName.indexOf(" ");// detects the first space in the name
        String firstName = fullName.substring(0,spaceFinder);
        System.out.println("First Name: " + firstName); //prints out the first name
        fullName = fullName.replaceFirst(firstName, ""); //removes the first name from the full name
        return fullName;
        
    }
     public static String printMiddleName(String nameInput){
        int spaceFinder = nameInput.indexOf(" ");// detects the first space in the name
        String firstName = nameInput.substring(0,spaceFinder);
        System.out.println("First Name: " + firstName); //prints out the first name
        nameInput = nameInput.replaceFirst(firstName, ""); //removes the first name from the full name
        return null;

   
    }
    public static String printLastName(){
        return null;

    }

    
    public static void main(String[] args) {
        printFirstName(); 
        
    }
    
}
