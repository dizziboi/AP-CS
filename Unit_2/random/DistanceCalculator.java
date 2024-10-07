package Unit_2.random;

public class DistanceCalculator
{

    public static double distance(double a, double b)
    {
        // TODO: calculate the distance from a to b using subtraction and Math.abs.
        double distance = Math.abs(a - b );

        return distance;
    }

    public static void main(String[] argv)
    {
        System.out.println("distance(13.5, 26.2) = " + distance(13.5, 26.2));
        System.out.println("distance(26.2, 13.5) = " + distance(26.2, 13.5));
        System.out.println(distance(13.5, 26.2) == distance(13.5, 26.2));
    }
}
