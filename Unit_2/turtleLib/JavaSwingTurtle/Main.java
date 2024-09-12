package Unit_2.turtleLib.JavaSwingTurtle;

import java.awt.*;

public class Main {
  public static void main(String[] args) {  
    World world = new World(800,600);
    Turtle yertle = new Turtle(world);
    // Add your own code in here 
    yertle.setColor(Color.red);
    //yertle.turnRight();
    yertle.turn(90);
    yertle.turn(120);
    //yertle.turn(90);
 
    world.setVisible(true);
  }
}
