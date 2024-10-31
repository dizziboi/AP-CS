package Unit_3.lab;
import java.util.Scanner;

public class bmicalc {

    public static Double bmi(){
        Scanner heightInput = new Scanner(System.in); //makes the scanner object for the price input
        System.out.println("What is your height in inches ");
        Double height = heightInput.nextDouble(); //reads the scanner 
       
        Scanner weightInput = new Scanner(System.in); //makes the scanner object for the price input
        System.out.println("What is your weight in pounds");
        Double weight = weightInput.nextDouble(); //reads the scanner 

        double heightSquared = height * height; // squares height

        Double BMI = (weight / heightSquared)*703; // calculates BMI
       
        System.out.println("Height (in inches): " + height);
        System.out.println("Weight (in pounds): " + weight);
        System.out.println("BMI = " + BMI);
        
        
            return BMI;
        
    }
    public static String weightClass(){
          Double bmiNum = bmi();
         // System.out.print(bmiNum);
        if (bmiNum > 30){ //sees if your bmi is over 30
            System.out.println("obese");
        } else if(bmiNum < 29 && bmiNum > 25) { // sees if your bmi is between 30 and 25
            System.out.println("overweight");
        } else if(bmiNum <= 24 && bmiNum > 18.5){ // sees if your bmi is betwwn 25 and 18.5
            System.out.println("normal");
        } else if(bmiNum < 18.5){ // sees if your bmi is less than 18.5
            System.out.println("underweight");
        }

        return null;
    }
    

    public static void main(String[] args) {
        weightClass();
    } 
}
