package Unit_4.For;

import Unit_2.turtleLib.JavaSwingTurtle.World;

import java.awt.Color;

import Unit_2.turtleLib.JavaSwingTurtle.*;


public class shapeturt {
        public static void main(String[] args)
    {
        World world = new World(400, 400);
        Turtle yertle = new Turtle(world);
        yertle.penUp(); // move a little to the left
        yertle.moveTo(100, 200);
        yertle.penDown();
        yertle.setColor(Color.BLUE);

        // Add your loop here!
        for (int count = 0; count < 3; count++){
        yertle.forward(100);
        yertle.turn(60);
        }
        world.show(true);
}
}