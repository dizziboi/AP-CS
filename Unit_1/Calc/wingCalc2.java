package Unit_1.calc;

public class wingCalc2 {
    public static void main(String[] args) {
        // Your code should use the variables
        // money, pricePerWing, numWings, and
        // initialize money and pricePerWing using the values above,
        // and calculate numWings using money and pricePerWing and type casting to int
        // and print out numWings
        double money = 4.50;
        double pricePerWing = 0.75;
        double numWings = (int)(money / pricePerWing);
        System.out.println(numWings);
    }
}
