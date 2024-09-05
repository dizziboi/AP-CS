package Unit_2.turtleTest.random;
import Unit_2.turtleTest.JavaSwingTurtle.*;
import java.awt.*;
import java.util.*;

public class turtTest {
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        World habitat = new World(300, 300);
        Turtle yertle = new Turtle();

        yertle.forward(50);
        yertle.left(0);
        yertle.tilt(90);
        yertle.forward(100);

        habitat.show(true);
        

    }
}
