package Unit_2.turtle;
import java.awt.*;
import java.lang.Math;
import java.util.*;
import Unit_2.turtleLib.JavaSwingTurtle.World;
import Unit_2.turtleLib.JavaSwingTurtle.*;


public class turtleDox {
    public static void main(String[] args) {
        World world = new World(300,300);
        Turtle yertle = new Turtle(world);

        int area;
        area = yertle.getWidth() * yertle.getHeight();
        System.out.println("Yertle's area is: "+ area) ;
    }
    
}
