package Unit_2.random;
import java.awt.*;
import java.util.*;

import Unit_2.turtleLib.Turtle;
import Unit_2.turtleLib.JavaSwingTurtle.*;
public class squareSquared {
    public static void main(String[] args) {
     @SuppressWarnings("unused")
    World habitat = new World(500, 500);
        Turtle yertle = new Turtle(-50,100);

        //make turtle draw a square
        yertle.forward(100);
        yertle.right(90);
        yertle.forward(100);
        yertle.right(90);
        yertle.forward(100);
        yertle.right(90);
        yertle.forward(100);
        yertle.up();
        yertle.left(90);
        yertle.forward(50);
        yertle.right(90);
        yertle.forward(50);
        yertle.down();
        yertle.right(90);
        yertle.forward(200);
        yertle.right(90);
        yertle.forward(200);
        yertle.right(90);
        yertle.forward(200);
        yertle.right(90);
        yertle.forward(200);
        
    }
}
