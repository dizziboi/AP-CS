package Unit_2.turtle;

import java.awt.Color;

import Unit_2.turtleLib.JavaSwingTurtle.*;


public class liveAndLearn {
    public static void main(String[] args) {
        World world = new World(800, 600);
        Turtle sonic  = new Turtle(world);
        Turtle shadow = new Turtle(world);

        sonic.setColor(Color.blue);
        shadow.setColor(Color.BLACK);

        sonic.forward();
        sonic.turnLeft();
        sonic.forward();
        sonic.turnLeft();
        sonic.forward();
        sonic.turnLeft();
        sonic.turn(36);
        sonic.forward();

        shadow.forward();
        shadow.turnLeft();
        shadow.forward();
        shadow.turnRight();
        shadow.forward();
        shadow.turnLeft();
        shadow.forward();
        shadow.turnRight();

        int whereIsSonic = (int) sonic.getDistance(0,0); //calculates out how far sonic is away from 0,0
        System.out.println("sonic is " + whereIsSonic + " away from 0,0");   

        int shadowX = shadow.getXPos();
        int shadowY = shadow.getYPos();


        int SonicDistanceFromShadow = (int) sonic.getDistance(shadowX, shadowY); ////calculates out how far sonic is away from shadow
        System.out.print( "sonic distance from shadow is " + SonicDistanceFromShadow);

        world.show(true);
    }
    
}
