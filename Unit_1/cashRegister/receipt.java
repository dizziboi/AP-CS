package Unit_1.cashRegister;

import java.util.Scanner;
@SuppressWarnings("resource")
public class receipt {
    public static void main(String[] args) {
        Scanner stuffImBuying = new Scanner(System.in); //makes the scanner object for stuff im buying
        System.out.println("what will you be buying");
        String buying = stuffImBuying.nextLine(); //reads the scanner 
        
        Scanner cost = new Scanner(System.in); //makes the scanner object for stuff im buying
       System.out.println("How much does it cost");
       String itemPrice = cost.nextLine(); //reads the scanner 


        System.out.println("--------------------------");
        System.out.println("|    fry's electronics   |");
        System.out.println("--------------------------");
        System.out.print(buying + "   ");
        System.out.print("$" + itemPrice);

    }
}
