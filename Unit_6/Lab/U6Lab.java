package Unit_6.Lab;

public class U6Lab {
    static int[] arrayCopy = {};
    
        public static int[] atLeastOneOdd(int[] num){
                arrayCopy = num;
                System.out.println(arrayCopy.toString());
        return null;
        }
        public static void main(String[] args) {
            int[] num2 = {2,4,6,8,11};
            atLeastOneOdd(num2);
    }
}
