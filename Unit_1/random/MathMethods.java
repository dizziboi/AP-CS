package Unit_1.random;

public class MathMethods {
         /* square method returns the square of a number.
        Do NOT change */
        public static int square(int number)
        {
            return number * number;
        }
   
        /** divide method divides x by y to return a double result .
           Do NOT change */
        public static double divide(double x, double y)
        {
            return x / y;
        }
   
        public static void main(String[] args)
        {
            // TO DO: Fix the method calls and data types below
            // Make sure the type, how many, and order of the
            // arguments match what the methods expect.
            // Make sure they are saved in the right type of variables.
            // result1 should be 4 squared
            // result2 should be 5 divided by 2
            int result1 = (int) square(4);
            double result2 = (double) divide(5, 2 );
            System.out.println("4 squared is " + result1);
            System.out.println("5 divided by 2 is " + result2);
}
}