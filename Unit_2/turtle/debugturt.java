package Unit_2.turtle;
import java.awt.*;
import java.util.*;

import Unit_2.turtleLib.Turtle;
import Unit_2.turtleLib.JavaSwingTurtle.*;


public class debugturt {
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        World habitat = new World(300,100);
        Turtle t0 = new Turtle();
        Turtle t1 = new Turtle();
        Turtle t2 = new Turtle();
        t0.forward(90);
        t1.right(90);
        t2.left(90);
        habitat.show(true);
    }
}
