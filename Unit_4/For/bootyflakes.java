package Unit_4.For;

import java.awt.Color;

import Unit_2.turtleLib.JavaSwingTurtle.*;


public class bootyflakes {
        public static void main(String[] args)
    {
        World world = new World(300, 300);
        Turtle yertle = new Turtle(world);
        //yertle.setSpeed(25); // fast 0 - 100 slow
        yertle.setColor(Color.blue);

        // Outer loop will do inner loop to draw a square,
        // and then turn a little each time
        // How many times should the outer loop run to complete the pattern? Try
        // some numbers between 5 and 15.
        for (int i = 1; i <= 5; i++)
        {

            // inner loop draws a square
            for (int sides = 1; sides <= 4; sides++)
            {
                yertle.forward();
                yertle.turn(90);
            }
            // turn a little before drawing square again
            yertle.turn(30);
        }
        world.show(true);
    }
}
