package Unit_1.song;

public class oldMcDonaldGoose {
    public static void intro()
    {
        System.out.println("Old MacDonald had a farm");
        chorus();
    }

    public static void chorus()
    {
        System.out.println("E-I-E-I-O");
    }

    public static void verse(String animal, String sound)
    {
        System.out.println("And on this farm, they had a " + animal);
        chorus();
        System.out.println("With a " + sound + " " + sound  + " here and a " + sound + " " + sound + " there");
        System.out.println("Here a " + sound + ", there a " + sound + ", everywhere a " + sound + " " + sound);
    }

    public static void main(String[] args)
    {
        intro();
        verse("cow","moo");
        intro();
        verse("duck","quack");
        intro();
        verse("goose", "honk");
        intro();
        verse("cat", "meow");
        intro();
        // TODO:
        // Call verse again with goose and honk
        //   and then call intro again


        // Call verse again with another animal and sound
        //  and then call intro again


     }
}
