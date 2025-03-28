
import java.util.ArrayList;

public class names {
    public static void main(String[] args)
    {
        ArrayList<String> nameList = new ArrayList<String>();
        nameList.add("Diego");
        nameList.add("Grace");
        nameList.add("Deja");
        System.out.println(nameList);
        nameList.set(0, "Caleb");
        System.out.println(nameList.get(0));
        System.out.println(nameList.get(1));
        System.out.println(nameList.get(2));
        System.out.println(nameList);
    }
}
