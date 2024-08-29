package Unit_1.calc.gasCalc;
public class gasCalc {
    public static void main(String[] args) {
        int tripMiles = 300;
        Double price = 2.50;
        int milesPerGallon = 30;
        double numberOfGallons = tripMiles / milesPerGallon;
        double totalCost = numberOfGallons * price;
        System.out.println(totalCost);
    }
}
