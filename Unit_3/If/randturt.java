package Unit_3.If;

import Unit_2.turtleLib.JavaSwingTurtle.*;

public class randturt {
        public static void main(String[] args)
    {
        World world = new World(500,400);
        Turtle yertle = new Turtle(world);
        
        // This is a loop that runs 10 times (you will learn to write loops in
        // Unit 4)
        
        for(int i = 1; i <= 10; i++)
        
        {
            yertle.forward(20);

            // Write an if/else statement that uses
            // Math.random() to do a coin flip (50%) to choose
            // between yertle.turnRight() or turnLeft()
            int e = (int) (0 * Math.random());
            System.out.println(e);
            if (e == 1){
            yertle.turnRight();
            }
            else if (e == 0){
            yertle.turnRight();
            }




        } // end of loop
        world.show(true);
        
    }
}
