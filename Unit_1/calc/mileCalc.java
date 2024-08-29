package Unit_1.calc;

public class mileCalc {
    public static void main(String[] args) {
       // Your code should declare the variables
        //  numGallons, milesPerGallon, and miles, and
        // calculate numGallons (the number of gallons left in the tank given the values above),
        // initialize milesPerGallon (the miles per gallon given above for this car),
        // calculate miles (the number of miles you can drive calculated from the other variables)
        // and print out miles. 
        double numGallons = 10 * .25;
        double milesPerGallon = 32;
        double miles = numGallons * milesPerGallon;
        System.out.println(miles);
    }
}
