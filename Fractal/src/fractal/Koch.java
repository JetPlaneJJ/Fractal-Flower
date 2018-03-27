package fractal;

import java.awt.Color;
import ch.aplu.turtle.*;

public class Koch
{
    private static double baseLength = 50;
    private static Turtle t;
    private static int colorRed = (int) Math.random()*256;
    
    public static void main(String[] args)
    {
        TurtleFrame frame = new TurtleFrame("Fractal", 1000, 700);
        t = new Turtle(frame);
        double locationX = 0.0;
        double locationY = 0.0;
        t.setHeading(0);
        t.setX(locationX);
        t.setY(locationY);
        t.speed(999999999999999999999999999999999999999999999999999999999999999.0);
        t.penDown();
        t.hideTurtle();
        
        
        Color x = new Color (colorRed, 0,0);
    	t.setPenColor(x);
        
        while (true)
        {
        	while (locationX < 200)
            {
        		t.penWidth(1);
        		drawFractal();
    	        locationX *= 2;
    	        t.setX(locationX);
    	        t.rt(90);
    	        t.penWidth(5);
    	        t.leftCircle(baseLength);
    	        baseLength++;
            }
        	while (locationX > -200)
        	{
        		t.penWidth(1);
        		drawFractal();
    	        locationX *= 0.5 - 2;
    	        t.setX(locationX);
    	        t.lt(90);
    	        t.penWidth(5);
    	        t.rightCircle(baseLength);
    	        baseLength++;
        	}
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
    	//Color x = new Color((int)(Math.random( )*256), (int)(Math.random( )*256), (int)(Math.random( )*256));
        if (colorRed < 256)
        {
			Color x = new Color (colorRed++, 0,0);
			t.setPenColor(x);
        }
        else
        {
        	Color x = new Color (colorRed--, 0,0);
			t.setPenColor(x);
        }
    }
    public static void drawKochCurve(int level_n, double length)
    {
    	if (level_n == 0)
    	{
	    	t.forward(length);
    	}
    	else
    	{
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
    	changeTurtleColor();
    	drawKochCurve(8, baseLength);
        t.right(45);
        drawKochCurve(4, baseLength);
        t.right(45);
        drawKochCurve(3, baseLength);
        t.right(45);
        drawKochCurve(6, baseLength);
        t.right(45);
        
        //changeTurtleColor();
    	drawKochCurve(6, baseLength);
        t.right(45);
        
        drawKochCurve(4, baseLength);
        t.right(45);
        
        drawKochCurve(3, baseLength);
        t.right(45);

        drawKochCurve(8, baseLength);
        t.right(180);
    }

    

}

