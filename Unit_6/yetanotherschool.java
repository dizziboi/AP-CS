package Unit_6;

public class yetanotherschool {
    public static void main(String[] args)
    {
        // declare, create, initialize arrays
        int[] highScores = {99, 98, 98, 88, 68, 100};
        String[] names = {"Jamal", "Emily", "Destiny", "Mateo", "Sofia", "Caleb"};
        highScores[4] = 97;
        // Print corresponding names and scores
        System.out.println(names[0] + " has a score of " + highScores[0]);
        System.out.println(names[1] + " has a score of " + highScores[1]);
        System.out.println(names[3] + " has a score of " + highScores[3]);
        System.out.println(names[4] + " has a score of " + highScores[4]);
    }
}
