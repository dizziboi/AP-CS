package Unit_1.cashRegister;
import java.util.Scanner;
public class scannerPrototype {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner stuffImBuying = new Scanner(System.in); //makes the scanner object
        System.out.println("what will you be buying");

        String buying = stuffImBuying.nextLine(); //reads the scanner 
        System.out.println("you are buying " + buying); // output my response 
    }
}
