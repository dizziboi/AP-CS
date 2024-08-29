package Unit_1.song;
public class oldMcDonaldDuck
{
    public static void intro()
    {
        System.out.println("Old MacDonald had a farm");
        chorus();
    }

    public static void chorus()
    {
        System.out.println("E-I-E-I-O");
    }

    public static void main(String[] args)
    {
        intro();
        System.out.println("And on that farm they had a cow.");
        chorus();
        System.out.println("With a moo moo here and a moo moo there");
        System.out.println("Here a moo, there a moo, everywhere a moo moo");
        intro();
        System.out.println("And on that that farm they had a duck");
        chorus();
        System.out.println("with a quack quack here and a quack quack there");
        System.out.println("Here a quack, there a quack, evewhere a quack quack");
        intro();

        // TODO:
        // 1. Call the method intro()

        // 2. Print out the line "And on that farm..."
        //    with a duck or another animal

        // 3. Call the method chorus

        // 4. Print out the lines with the appropriate animal sounds

        // 5. Call the method intro again

    }
}