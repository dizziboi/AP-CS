package Unit_4.lab;
import java.util.Scanner;

public class PrimesLab {
 
    public static int countFactors(){
        Scanner primeInput = new Scanner(System.in); //makes the scanner object for the price input
        System.out.println("Type in a number ");
        int number = primeInput.nextInt(); //reads the scanner 
        int count = 0;
        System.out.println(number);
        while ((number % 2 >= count)) {
            count++;
            

        }
        System.out.print(count);
        return 0;
    }
    public static void main(String[] args) {
        countFactors();
    }
}
