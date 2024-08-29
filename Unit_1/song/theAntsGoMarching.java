package Unit_1.song;

public class theAntsGoMarching {
    public static void chorus(String num)
    {
        System.out.println("The ants go marching " + num
                         + " by " + num + " hurrah, hurrah");
        System.out.println("The ants go marching " + num
                         + " by " + num + " hurrah, hurrah");
    }

    public static void verse(String num, String action)
    {
        System.out.println("The ants go marching " + num + " by " + num);
        System.out.println("The little one stops to " + action);
        System.out.println("And they all go marching down to the ground");
        System.out.println("To get out of the rain, BOOM! BOOM! BOOM! BOOM!\n");
    }

    public static void main(String args[])
    {
        chorus("one");
        verse("one", "suck a thumb");
        chorus("two");
        verse("two", "tie a shoe");
        chorus("three");
        verse("three", "climb a tree");
        // Call the chorus and verse methods
        // with the correct arguments
        // to print out all three verses above.



    }
}
