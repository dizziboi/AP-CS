public class Unit2_MathClass_Lab {
    public static void main(String[] args) {
        // fill in the code
        // create a random double in the range [0, 1), store in variable a, print out a
        double a = Math.random();
        System.out.println("Random double in the range 0,1: " + a);

        // create a random double in the range [0, 10), store in variable b, print out b
        double b = 10 * Math.random();
        System.out.println("Random double in the range of 0,10: " + b);

        // print out a random double in the range [3,7), 
        double c = 3 * Math.random() + 7;
        System.out.println("Random double in the range of 3,7: " + c);
        
        // print out a random double in the range [-2,8), 
        double d = -2 * Math.random() + 8;
        System.out.println("Random double in the range of -2,8: " + d);

        // print out a random integer from the set {0, 1, 2, ..., 8}
        int e = (int) (9 * Math.random());
        System.out.println("Random integer from a set of 0 to 8: " + e);

        // print out a random integer from the set {1, 2, ..., 10}
        int f = (int) (10 * Math.random()) + 1;
        System.out.println("Random interger of from a set of 1 to 10: " + f);

        // print out a random integer from the set {5, 6, ..., 16}
        int g = (int) (10 * Math.random()) + 1;
        System.out.println("Random interger from the set of 5 to 16:" + g);

        // create a variable called min which is the smallest possible integer, print it 
        int min = Integer.MIN_VALUE;
        System.out.println("Smallest value of an interger: " + min);
        // subtract 1 from min, print it, what happened? 
        //Answer: The interger loops into being the largest interger
        min --;
        System.out.println("Smallest interger subtracted by 1" + min);

        // create a variable called max which is the largest possible integer, print it 
        int max = Integer.MAX_VALUE;
        System.out.println("Largest possible integer: " + max);

        // add 1 to max, print it, what happened?
        //Answer: The interger loops into being the smallest interger
        max ++;
        System.out.println("Largest interger being added by 1: " +max);
    }
    
}
