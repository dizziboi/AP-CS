package Unit_1.calc;

public class disCalc {
    public static void main(String[] args) {
        double price = 52.99;
        double discount = 0.6;
        double savings = price * discount;
        double total = price - savings;
        System.out.println(total);
    }
}
