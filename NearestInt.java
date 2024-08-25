public class NearestInt
{
  public static void main(String[] args)
  {
    double number = 5.0 / 3;
    int nearestInt = (int) (number + 0.5);
    System.out.println("5.0/3 = " + number);
    System.out.println("5/3 truncated: " + (int) number);
    System.out.println("5.0/3 rounded to nearest int: " + nearestInt);
    double negNumber = -number;
    int nearestNegInt = (int) (negNumber - 0.5);
    System.out.println("-5.0/3 rounded to nearest negative int: " + nearestNegInt);
    System.out.println((int)2.3 + nearestInt);
    
    // Print the result of rounding (number + 2.3) to the nearest int.
    
  }
}