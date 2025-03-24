<<<<<<< HEAD

=======
package Unit_6.Lab;
import java.util.Arrays;
>>>>>>> 427e51920c8daa5842e79e9a37343f8d6e2cb09d

public class U6Lab {
    static boolean isTrue;
    static boolean foundNoOdd = false;

    static int[] arrayCopy = {};

    public static String atLeastOneOdd(int[] num) {
        for (int i = num.length - 1; i >= 0; i--) { // algorithm for detecting if the num is True
            if ((num[i] % 2) == 0) {
                isTrue = false;
            } else {
                isTrue = true;
            }
            if (isTrue) {
                System.out.println("At least one number is odd");
            } else {
                System.out.print("");
            }
        }

        return null;
    }

    public static String shiftRight(int[] num){
        
        int[] shiftedRight = new int[num.length]; //Makes a copy of the array that has the same lenght as the original 
        shiftedRight[0] = num[num.length-1]; // Sets the last number in the original as the first
        for (int i = 1; i <= num.length-1; i++){
            shiftedRight[i] = num[i-1];
        }
        System.out.println(Arrays.toString(shiftedRight));
        return null;
    }

    public static String shiftLeft(int[] num){
        int[] shiftedLeft = new int[num.length]; //Makes a copy of the array that has the same lenght as the original 
        shiftedLeft[shiftedLeft.length-1] = num[0]; // Sets the first number in the original as the last 
        for (int i = 0; i <= num.length-1; i++){
            i++;
        }
        System.out.println(Arrays.toString(num));

        System.out.println(Arrays.toString(shiftedLeft));
        return null;
    }

    public static void main(String[] args) {
        int[] num = { 2, 4, 10, 8, 8 };
        int[] toTheRight = {11,34,5,17,56};

        atLeastOneOdd(num);
        shiftRight(num);
        shiftLeft(toTheRight);
    }
}
