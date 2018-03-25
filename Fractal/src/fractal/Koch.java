package fractal;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.event.*;
import ch.aplu.turtle.*;

public class Koch
{
    private static final double baseLength = 300;
    private static Turtle t;
    
    public static void main(String[] args)
    {
        TurtleFrame frame = new TurtleFrame("Fractal", 1000, 700);
        t = new Turtle(frame);
        Color x = new Color((int)(Math.random( )*256), 0, 0);
        t.setPenColor(x);
        double locationX = -500.0;
        t.penDown();
        t.setHeading(0);
        t.penWidth(10);
        t.setX(locationX);
        t.setY(-150.0);
        t.speed(999999999999999999999999999999999999999999999999999999999999999.0);
        while (locationX < 400)
        {
        	drawFractal();
	        locationX += 100;
	        t.setX(locationX);
        }
    }
    
    public static void drawTriangle()
    {
    	t.left(60);
    	t.forward(40);
    	t.right(120);
    	t.forward(40);
    	t.right(120);
    	t.forward(40);
    	
    }
    public static void changeTurtleColor()
    {
    	Color x = new Color((int)(Math.random( )*256), (int)(Math.random( )*256), (int)(Math.random( )*256));
        t.setPenColor(x);
    }

    public static void drawKochCurve(int level_n, double length)
    {
    	if (level_n == 0)
    	{
	    	t.forward(length);
    	}
    	else
    	{
    		changeTurtleColor();
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
    	drawKochCurve(3, baseLength);
        t.right(90);
        
        drawKochCurve(3, baseLength);
        t.right(90);
        
        drawKochCurve(3, baseLength);
        t.right(90);

        drawKochCurve(3, baseLength);
        t.right(90);
    }


}

