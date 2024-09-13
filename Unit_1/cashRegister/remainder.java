package Unit_1.cashRegister;

import java.util.Scanner;
import java.math.*;
@SuppressWarnings("resource")

public class remainder {
    public static void main(String[] args) {

        Scanner priceInput = new Scanner(System.in); //makes the scanner object for the price input
        System.out.println("Enter the price");
        Double price = priceInput.nextDouble(); //reads the scanner 

        Scanner paidInput = new Scanner(System.in); //makes the scanner object for the paid input
        System.out.println("Enter the amount paid");
        Double amount = paidInput.nextDouble(); //reads the scanner 
        
        double total;
         total = amount - price; //subtracts the amount from the price

         double roundOff = Math.round(total * 100.0) / 100.0; //rounds up the total 

        System.out.println("Change owed $" + roundOff); // output my response 
    }
}
