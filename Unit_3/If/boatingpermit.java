package Unit_3.If;

public class boatingpermit {
    public static void main(String[] args)
    {
      // Use Math.random() to generate an age between 5 and 25 years old.
      int age = (int) ( Math.random() *(25-5))+ 5;
      System.out.println("You are " + age + " years old.");
 
      // Add a check to see if the age is at least 16 in the parentheses.
      if (age > 16 )
      {
          System.out.println("You can get a driver's license in most states!");
      }
      else
      {
          System.out.println("Sorry, you need to be older to get a driver's license.");
      }
    }
}
