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
        System.out.println(counter);
        return counter;
  
    }
    public static boolean isPrime() {
       int factor = countFactors();    
       if (factor <= 2){
        System.out.println("true");
       } else{
        System.out.println("false");
       }
        return false;
    }

    public static int countPrimes(){
        
       if(isPrime()){

        }
        return 0;
        
    }

    public static int fourHeads(){
    int hCount = 0;
        while (hCount <= 3){
        int coinFlip =  (int) (Math.random() +.5 );
        if (coinFlip == 0){
            System.out.print(" H");
            hCount++;
        } else {
            System.out.print(" T");
            hCount = 0;
        }
    } System.out.print("Four heads in a row!");
            return 0;
    }

    
    public static void main(String[] args) {
        //isPrime();
        fourHeads();
    }
}
