

import Unit_2.turtleLib.JavaSwingTurtle.World;

import java.awt.Color;

import Unit_2.turtleLib.JavaSwingTurtle.*;


public class forturt {
        public static void main(String[] args)
    {
        World world = new World(500, 500);
        Turtle yertle = new Turtle(world);
        
        yertle.turn(-90);
        yertle.penUp();
        //yertle.moveTo(100,200);
        yertle.penDown();
        yertle.setColor(Color.BLUE);
        
        //Change the following code to use a for loop to draw the square
        for (int n = 1; n <=3; n++){
        yertle.forward();
        yertle.turn(120);
        } 

        world.show(true);
    }
}
