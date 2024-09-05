package Unit_2.random;
import Unit_2.turtleLib.Turtle;
import Unit_2.turtleLib.JavaSwingTurtle.*;

public class cornerturt {
    public static void main(String[] args) {
              // Change the World constructor to 300x400
      World world = new World(300,400);

      // Change the Turtle constructor to put the turtle in the top right corner
      Turtle t1 = new Turtle();
      //Turtle t2 = new Turtle(50,50);

      t1.left(180);
      t1.forward(90);
      world.show(false);
    }
}
