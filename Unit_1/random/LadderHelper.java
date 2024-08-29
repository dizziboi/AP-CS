package Unit_1.random;

public class LadderHelper {
    /* ladderSizeNeeded computes the hypotenuse of a right triangle
     * given the lengths of the other two sides.
     * @param height : the height of the window
     * @param width : the width of the moat
     * @return the length of the ladder needed
     */
    public static double ladderSizeNeeded(double height, double width)
    {
        double ladderSize;
        // TODO: Calculate ladderSize using the Pythagorean theorem
        // with the Math.sqrt and Math.pow (or just *) methods
        // using the arguments height and width
        ladderSize = Math.sqrt(height*height + width*width);


        return ladderSize;
    }

    public static void main(String[] argv)
    {
        double size;
        // TODO: Call the ladderSizeNeeded method
        // with the height of 30 and the width of 40 and save it in size.
         size = ladderSizeNeeded(40, 30);
        System.out.println("Beloved, I need a " + size + " foot ladder!");
    }
}
