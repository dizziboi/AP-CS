package Unit_4.For;

import Unit_2.turtleLib.JavaSwingTurtle.*;
import java.awt.*;
public class polyturt {
        public static void main(String[] args)
    {
        World world = new World(800, 600);
        Turtle yertle = new Turtle(world);
        //yertle.setSpeed(25); // fast 0 - 100 slow
        yertle.setColor(Color.blue);

        // Use this variable in the loops
        int turnAmount = 30;

        // 1. Write a for loop that runs many times
        for (int t = 0; t <= 10; t++){
            for (int n = 0 ;n <=10; n++){
                if(n == 1){
                yertle.setColor(Color.red);
                } else if (n == 2)
                {yertle.setColor(Color.green);}
                else if (n == 3){
                    yertle.setColor(Color.yellow);
                } else if (n > 4){
                    yertle.setColor(Color.magenta);
                }
                yertle.forward();
                yertle.turn(120);
            }
            yertle.turn(turnAmount);
        }
        // 2. Change it to use turnAmount to figure out how many times to run

        // 1 & 2. Write an inner loop that draws a triangle (3 sides, 120 degree
        // turns)
        // 3. Then change it to be any polygon with a variable n

        // turn turnAmount degrees before drawing the polygon again

        // 4. Add an if statement that changes the colors depending on the loop
        // variables

        world.show(true);
    }
}
