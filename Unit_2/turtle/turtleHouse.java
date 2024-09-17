package Unit_2.turtle;
import java.awt.Color;

import Unit_2.turtleLib.JavaSwingTurtle.*;


public class turtleHouse {
    public static void main(String[] args) {
        World world = new World(800,600);
        Turtle hurtle = new Turtle(world);
        
        hurtle.setColor(Color.red);
    
        hurtle.turn(90); //makes the roof
        hurtle.forward();
        hurtle.turnLeft();
        hurtle.turn(-30);
        hurtle.forward();
        hurtle.turn(-120);
        hurtle.forward();
        
        hurtle.setColor(Color.BLACK);
        hurtle.turn(150);

        hurtle.turnRight(); // makes the house
        hurtle.forward();
        hurtle.turnRight();
        hurtle.forward();
        hurtle.turnLeft();
        hurtle.turnLeft();
        hurtle.turnLeft();
        hurtle.forward();
        hurtle.turnRight();
        hurtle.forward();
        
        hurtle.setColor(Color.green);

        hurtle.penUp(); // makes the door
        hurtle.backward();
        hurtle.turnRight();
        hurtle.forward(35);
        hurtle.penDown();
        hurtle.turnLeft();
        hurtle.forward(45);
        hurtle.turnRight();
        hurtle.forward(30);
        hurtle.turnRight();
        hurtle.forward(45);
       // hurtle.setShowInfo(true);

    }
    
}
