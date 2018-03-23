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
        t.setX(0.0);
        t.setY(-100.0);
        t.speed(600.0);
        //t.hideTurtle();
        //drawFractal();
        
        //drawTriangle();
        drawKochCurve(3, 400);
    }
    
    public static void drawTriangle()
    {
    	t.penDown();
    	t.setHeading(120);
    	t.speed(5.0);
    	t.forward(5);
    	t.penDown();
    	t.setHeading(120);
    	t.speed(5.0);
    	t.forward(5);
    	t.penDown();
    	t.setHeading(120);
    	t.speed(1.0);
    	t.forward(5);
    	
    }
    public static void changeTurtleColor()
    {
        t.setPenColor(new Color(t.getPenColor().getRGB() + 10));
    }

    public static void drawKochCurve(int level_n, double length)
    {
    	if (level_n == 0)
    	{
	    	t.forward(length);
    	}
    	else
    	{
    		Color p = new Color(50);
    		t.setColor(p);
    		t.penDown();
	    	t.speed(200.0);
	    	drawKochCurve(level_n - 1, length/3);
	    	
	    	t.left(60);
	    	drawKochCurve(level_n - 1, length/3);
	    	
	    	t.right(120);
	    	drawKochCurve(level_n - 1, length/3);
	    	
	    	t.left(60);
	    	drawKochCurve(level_n - 1, length/3);
    	}
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
