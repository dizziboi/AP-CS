package Unit_1.test;
public class TestOverflow
{
    public static void main(String[] args)
    {
        int id = 214748365; // overflow
        int negative = -214748365; // overflow
        System.out.println(id);
        System.out.println(negative);
    }
}
