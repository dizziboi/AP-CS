package Unit_2.random;

import java.awt.*;
import Unit_2.turtleLib.JavaSwingTurtle.*;


public class rgbDukeNukem {
  public static void main(String[] args) {  
    World world = new World(800,600);
    Turtle yertle = new Turtle(world);
    // Add your own code in here 
    yertle.setColor(Color.red);
    yertle.turn(90);
    yertle.forward();
    yertle.turnLeft();
    yertle.turn(-30);
    yertle.forward();
    yertle.turn(-120);
    yertle.forward();
    yertle.setColor(Color.green);
    yertle.forward();
    yertle.turnLeft();
    yertle.turn(-30);
    yertle.forward();
    yertle.turn(-120);
    yertle.forward();
    yertle.setColor(Color.blue);
    yertle.forward();
    yertle.turnLeft();
    yertle.turn(-30);
    yertle.forward();
    yertle.turn(-120);
    yertle.forward();
    world.setVisible(true);
  }
}
