package Unit_1.calc.gasCalc;

public class gasCalc3 {
    public static void main(String[] args) {
        int mpg = 26;
        int tankHolds = 15;
        double numGalls = (double) tankHolds / 2;
        double miles = numGalls * mpg;
        System.out.println(miles);
    }
}
