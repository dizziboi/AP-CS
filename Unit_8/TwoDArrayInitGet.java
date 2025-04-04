package Unit_8;

public class TwoDArrayInitGet
{
    public static void main(String[] args)
    {
        String[][] seatingInfo =
        {
            {"Jamal", "Maria"},
            {"Jake", "Suzy"},
            {"Emma", "Luke"},
            {"Caleb", "Jude"}
        };
        String name = seatingInfo[0][0];
        System.out.println(name + " is at [0,0]");
        String name1 = seatingInfo[3][0];
        System.out.println(name1 + " is at [3,0]");
        String name2 = seatingInfo[3][1];
        System.out.println(name2 + " is at [3,1]");
    }
}


