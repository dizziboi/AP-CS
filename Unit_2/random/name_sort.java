//caleb brown
//due 10/3/24
//day submitted 
//pig Latin-Name Lab 

package Unit_2.random;
import java.util.Scanner;

import Unit_1.random.name;


public class name_sort {
    static void askForName() { //Method for asking your name 
        Scanner myName = new Scanner(System.in); //makes the scanner object for stuff im buying
        System.out.println("what is your name");
        String Name = myName.nextLine(); //reads the scanner 
        int spaceFinder = Name.indexOf(" ");// detecst the first space 
        System.out.print(spaceFinder);
    }
    static void firstName(String Name , int spaceFinder){
        //int spaceFinder = Name.indexOf(" ");
        System.out.println(spaceFinder);
        System.out.print(Name.substring(0,spaceFinder ));
    }
    static int spaceFinder(){
        return int spaceFinder = Name.indexOf(" ");// detecst the first space ;

    }

    
    public static void main(String[] args) {

        askForName();
    }
    
}
