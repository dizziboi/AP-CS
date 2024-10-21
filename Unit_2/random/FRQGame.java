package Unit_2.random;

public class FRQGame
{
    public static void main(String[] args)
    {
        // 1. Declare 3 objects of the Level class called level1, level2, and level3
        // with the following points and goals: 100 points and true,
        // 100 points and true,
        // and 200 points and true
        Level level1 = new Level(100,true);
        Level level2 = new Level(100,true);
        Level level3 = new Level(200,true);

        int score = 0;

        // 2. Calculate the score for the game by adding the points
        // from each level using their getPoints() method
        // but double the level 2 points and triple the level 3 points
        int level1Point = level1.getPoints();
        int level2Point = level2.getPoints();
        int level3Point = level3.getPoints();
        level2Point = level2Point * 2;
        level3Point = level3Point * 3;
        score = level1Point + level2Point + level3Point;


        System.out.println("Score is " + score);
    }
}

/* The Level class: do not change */
class Level
{
    private int points;
    private boolean goal;

    /** Constructor for the Level class */
    public Level(int p, boolean g)
    {
        points = p;
        goal = g;
    }

    /** Returns true if the player reached the goal on this level and returns false otherwise */
    public boolean goalReached()
    { return goal; }

    /** Returns the number of points recorded for this level */
    public int getPoints()
    { return points; }
}
