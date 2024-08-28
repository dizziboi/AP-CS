package Unit_1.Calc;
public class dogYearsCalc
{
  public static void main (String[] args)
{
   // Fill in values for these variables
        int currentYear = 2024;
        int birthYear = 2007;
        int dogBirthYear = 2019;

        // Write a formula to calculate your age from the currentYear and
        // your birthYear variables
        int age = 17;
          System.out.println(currentYear - birthYear);
          

        // Write a formula to calculate your dog's age from the currentYear
        // and dogBirthYear variables
        int dogAge = 5;
          System.out.println(currentYear - dogBirthYear);

        // Calculate the age of your dog in dogYears (7 times your dog's age
        // in human years)
        int dogYearsAge = 35;
        System.out.println(dogAge*7);

        // Print out your age, your dog's age, and your dog's age in dog
        // years. Make sure you print out text too so that the user knows what
        // is being printed out.
        System.out.println("your age is " + age);
        System.out.println("your dog's age is " + dogAge );
        System.out.println("your dog's age in dog years are " + dogYearsAge);
        
        
  }
}

