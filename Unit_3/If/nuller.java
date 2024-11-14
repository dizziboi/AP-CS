package Unit_3.If;

public class nuller {
    public static void main(String[] args)
    {
        String s = "apple";
        if (s.indexOf("a") >= 0)
        {
            System.out.println(s + " contains an a");
        }
        if (s != null && s.indexOf("a") >= 0)
        {
            System.out.println(s + " contains an a");
        }
    }
}
