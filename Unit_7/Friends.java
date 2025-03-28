import java.util.*;

public class Friends {
    public static void main(String[] args)
    {
        ArrayList<String> names = new ArrayList<String>();
        String[] friends = {"Sam", "Jessica", "Mark", "Alexis"};
        for (int i = 0; i < friends.length; i++)
        {
            names.add(friends[i]);
        }
        System.out.println(names);
    }
}
