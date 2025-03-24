package Unit_6.Lab;
import java.util.Arrays;

public class Lab13a8 {
    // true - prime
    // false - not prime
    public static void computePrimes(boolean[] primes){ //main method for calculating prime numbers 
        System.out.println("COMPUTING PRIME NUMBERS \n");
        boolean prime[] = new boolean[primes.length + 1];
        Arrays.fill(prime, true); //Sets everything in the array to false
        for (int i = 0;i <= primes.length; i++){
            if (i % 2 == 0 || i % 3 == 0 ){
                prime[i] = false;
            } 

            
        }
        System.out.println(Arrays.toString(prime));
    }

    public static void displayPrimes(boolean[] primes){
        System.out.println("PRIMES BETWEEN 1 AND " + primes.length);
    }

    public static void main(String[] args) {
        System.out.println("\nLAB13A 80 POINT VERSION\n");    
        final int MAX = 21;
        boolean primes[];
        primes = new boolean[MAX];
        computePrimes(primes);
        displayPrimes(primes);

        
        // debug code
        //System.out.println(Arrays.toString(primes));
        //int test;
        //test = 12%3;
        //System.out.println(test);
    }
}
