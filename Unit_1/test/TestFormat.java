package Unit_1.test;
public class TestFormat
{
    public static void main(String[] args)
    {
        double number = 10.0 / 3;
        System.out.println(number);
        // format number to show 2 digits after .
        System.out.printf("%.2f", number);
        // format also with $ and newline
        System.out.printf("$%.2f\n", number);
        // Print out the result of 2.0/3 formatted to show 2 digits after the decimal point.
        System.out.printf("%.2f", 2.0 / 3);

    }
}