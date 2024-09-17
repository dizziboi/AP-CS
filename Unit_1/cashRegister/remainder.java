package Unit_1.cashRegister;

import java.util.Scanner;
import java.math.*;
@SuppressWarnings("resource")

public class remainder {
    public static void main(String[] args) {

        Scanner priceInput1 = new Scanner(System.in); //makes the scanner object for the price input
        System.out.println("Item 1 Price");
        Double price1 = priceInput1.nextDouble(); //reads the scanner 

        Scanner priceInput2 = new Scanner(System.in); //makes the scanner object for the price input
        System.out.println("Item 2 Price");
        Double price2 = priceInput2.nextDouble(); //reads the scanner 

        Scanner priceInput3 = new Scanner(System.in); //makes the scanner object for the price input
        System.out.println("Item 3 Price");
        Double price3 = priceInput3.nextDouble(); //reads the scanner 

        Scanner paidInput = new Scanner(System.in); //makes the scanner object for the paid input
        System.out.println("Enter the amount paid");
        Double amount = paidInput.nextDouble(); //reads the scanner 

        double priceTotal;
         priceTotal = price1 + price2 + price3; 
        
        double total;
         total = amount - priceTotal; //subtracts the amount from the price

         double roundOff = Math.round(total * 100.0) / 100.0; //rounds up the total 

        System.out.println("Change owed:$" + roundOff); // output my response 
    }
}
