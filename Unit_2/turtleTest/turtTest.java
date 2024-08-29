package Unit_2.turtleTest;
import Unit_2.turtleTest.javaSwingTurtle.*;
import java.awt.*;
import java.util.*;

public class turtTest {
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        World habitat = new World(300, 300);
        Turtle yertle = new Turtle();

        yertle.forward(0);
        yertle.tilt(0);
        yertle.forward(0);

        habitat.show(true);

    }
}
