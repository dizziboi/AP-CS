package Unit_3.If;

public class Magic8Ball
{
    public static void main(String[] args)
    {
        // Get a random number from 1 to 8
        int fortune = (int) ((8 * Math.random()) + 1);
        
        // Use if statements to test the random number
        // and print out 1 of 8 random responses
        if (fortune == 1)
        {
            System.out.println("Yes");
        }
        if (fortune == 2)
        {
            System.out.println("No");
        }
        if (fortune == 3)
        {
            System.out.println("Maybe"); 
        }
        if (fortune == 4)
        {
            System.out.println("In another life");
        }
        if (fortune == 5)
        {
            System.out.println("In the foreseeable future");
        }
        if (fortune == 7)
        {
            System.out.println("If the stars align");
        }
        if (fortune == 8)
        {
            System.out.println("Not likely");
        }
    }
}