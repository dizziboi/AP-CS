package Unit_2.random;

public class lowercase {
    public static void main(String[] args)
    {
        String name1 = "ALEX";
        String name2 = name1.substring(1,name1.length());
        name2 = name2.toLowerCase();
        name2 = "A" + name2;
        System.out.println(name2);
    }
}
