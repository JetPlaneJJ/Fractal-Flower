package fractal;

import java.awt.Color;

import ch.aplu.turtle.*;

public class Koch
{
    private static final double baseLength = 300;
    private static Turtle t;
    
    public static void main(String[] args)
    {
        TurtleFrame frame = new TurtleFrame("Fractal", 1000, 700);
        t = new Turtle(frame);
        t.penDown();
        t.setHeading(0);
        t.speed(9999999999999999999999.0);
        t.hideTurtle();
        drawFractal();
    }
    
    public static void changeTurtleColor()
    {
        t.setPenColor(new Color(t.getPenColor().getRGB() + 10));
    }

    public static void drawKochCurve(int level_n, double length)
    {
    	// TODO: PART 1: FILL OUT THIS METHOD
    	//
    	// Code up the following algorithm:
    	//
    	// Base case: level_n == 0:
    	// Just draw a segment with the given length
    	//
    	// Recursive case: 
    	// Call this method recursively to draw 4 segments of
    	// level_n - 1, and with length / 3.  Between those
    	// recursive calls, turn "some number of degrees"
    	// (see the slide for an illustration)
    }    

    public static void drawFractal()
    {
    	// TODO: PART 2: MODIFY THIS METHOD
    	//
    	// Generate a Koch *snowflake* by calling drawKochCurve 3 times
    	// (same level and length), with 60 degree angles on the *inside*
    	// (like an equilateral triangle).  No additional recursion necessary.

        drawKochCurve(10, baseLength);
    }
}
