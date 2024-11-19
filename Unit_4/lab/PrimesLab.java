package Unit_4.lab;
import java.util.Scanner;

public class PrimesLab {
 
    public static int countFactors(){
        Scanner primeInput = new Scanner(System.in); //makes the scanner object for the price input
        System.out.println("Type in a number ");
        int numInput = primeInput.nextInt(); //reads the scanner 
        int factor = 1;
        int counter = 0;
        while(factor<=numInput) {
            if(numInput%factor==0) {
                counter++;
            }
            factor++;
            
        }
        System.out.print(counter);
        return factor;
    }
    public static void main(String[] args) {
        countFactors();
    }
}
