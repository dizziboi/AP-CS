package Unit_3.If.lab;
import java.util.Scanner;

import Unit_1.random.name;

public class bmicalc {

    public static String bmi(){
        Scanner heightInput = new Scanner(System.in); //makes the scanner object for the price input
        System.out.println("What is your height in inches ");
        Double height = heightInput.nextDouble(); //reads the scanner 
       
        Scanner weightInput = new Scanner(System.in); //makes the scanner object for the price input
        System.out.println("What is your weight in pounds");
        Double weight = weightInput.nextDouble(); //reads the scanner 

        height = height *height; 

        Double BMI = (weight / height)*703 ; 
       

        System.out.println("Your BMI is " + BMI);
        
        public static String weightClass(double height, double weight){
        
            return null;
        
    }


    public static void main(String[] args) {
        bmi();

    } 
}
